package ITksiki.TalantDemo.security.jwt;

import ITksiki.TalantDemo.entity.Role;
import ITksiki.TalantDemo.entity.User;
import ITksiki.TalantDemo.enums.Status;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public final class JwtUserFactory {

    public JwtUserFactory() {
    }

    public static JwtUser create(User user) {
        return new JwtUser(
                user.getId(),
                user.getName(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getPassword(),
                mapToGrantedAuthorities(user.getRoles()),
                user.getStatus().equals(Status.ACTIVE),
                user.getUpdate()
        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(Collection<Role> userRoles) {
        return userRoles.stream()
                .map(role ->
                        new SimpleGrantedAuthority(role.getName())
                ).collect(Collectors.toList());
    }
}