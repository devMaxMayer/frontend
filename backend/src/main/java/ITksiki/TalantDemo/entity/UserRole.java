package ITksiki.TalantDemo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "user_role", schema = "public", catalog = "talant")
public class UserRole extends BaseEntity {
    public UserRole(User user, Role role) {
        this.user = user;
        this.role = role;
    }

    private User user;
    private Role role;

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id", nullable = false)
    public User getUser() {
        return user;
    }

    public void setUser(User userByIdUser) {
        this.user = userByIdUser;
    }

    @ManyToOne
    @JoinColumn(name = "id_role", referencedColumnName = "id", nullable = false)
    public Role getRole() {
        return role;
    }

    public void setRole(Role roleByIdRole) {
        this.role = roleByIdRole;
    }
}
