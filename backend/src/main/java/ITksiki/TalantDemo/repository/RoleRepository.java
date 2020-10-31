package ITksiki.TalantDemo.repository;

import ITksiki.TalantDemo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
