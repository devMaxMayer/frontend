package ITksiki.TalantDemo.dackend.repository;

import ITksiki.TalantDemo.dackend.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}
