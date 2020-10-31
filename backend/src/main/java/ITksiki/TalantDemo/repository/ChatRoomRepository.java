package ITksiki.TalantDemo.repository;

import ITksiki.TalantDemo.entity.ChatRoom;
import ITksiki.TalantDemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, Long> {

    @Query(nativeQuery = true,
            value = "select distinct true " +
            "from chat_room cr " +
            "join chat_room_user cru on cr.id = cru.id_chat_room " +
            "where cr.id_chat_room_type = :chatRoomTypeId " +
            "and ((cr.id_creator_user = :currentUserId " +
            "           and cru.id_user = :userWithWhomId) " +
            "      or (cr.id_creator_user = :userWithWhomId " +
            "           and cru.id_user = :currentUserId)) " +
            "")
    Boolean checkChat(@Param("currentUserId") Long currentUserId,
                      @Param("userWithWhomId") Long userWithWhomId,
                      @Param("chatRoomTypeId") Long chatRoomTypeId);
}
