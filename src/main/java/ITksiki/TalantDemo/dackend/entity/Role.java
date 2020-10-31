package ITksiki.TalantDemo.dackend.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "role", schema = "public", catalog = "talant")
public class Role extends BaseEntity {

    public static final Role USER = new Role(1L, "USER");
    public static final Role ADMINISTRATOR = new Role(2L, "ADMINISTRATOR");

    public Role(Long id, String name) {
        super(id);
        this.name = name;
    }

    private String name;
    private Collection<UserRole> userRoles;

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "role")
    public Collection<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Collection<UserRole> userRolesById) {
        this.userRoles = userRolesById;
    }
}
