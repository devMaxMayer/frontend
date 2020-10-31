package ITksiki.TalantDemo.repository;

import ITksiki.TalantDemo.entity.ChatRoomUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomUserRepository extends JpaRepository<ChatRoomUser, Long> {

}
