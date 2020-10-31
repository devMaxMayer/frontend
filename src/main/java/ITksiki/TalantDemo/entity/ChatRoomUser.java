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
@Table(name = "chat_room_user", schema = "public", catalog = "talant")
public class ChatRoomUser extends BaseEntity {
    private User user;
    private ChatRoom chatRoom;

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id", nullable = false)
    public User getUser() {
        return user;
    }

    public void setUser(User userByIdUser) {
        this.user = userByIdUser;
    }

    @ManyToOne
    @JoinColumn(name = "id_chat_room", referencedColumnName = "id", nullable = false)
    public ChatRoom getChatRoom() {
        return chatRoom;
    }

    public void setChatRoom(ChatRoom chatRoomByIdChatRoom) {
        this.chatRoom = chatRoomByIdChatRoom;
    }
}
