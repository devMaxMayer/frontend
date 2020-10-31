package ITksiki.TalantDemo.dackend.repository;

import ITksiki.TalantDemo.dackend.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
