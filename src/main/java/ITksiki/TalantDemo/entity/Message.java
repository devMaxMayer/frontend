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
public class Message extends BaseEntity {
    private String message;
    private User userByIdUser;
    private ChatRoom chatRoomByIdChatRoom;

    @Basic
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id", nullable = false)
    public User getUserByIdUser() {
        return userByIdUser;
    }

    public void setUserByIdUser(User userByIdUser) {
        this.userByIdUser = userByIdUser;
    }

    @ManyToOne
    @JoinColumn(name = "id_chat_room", referencedColumnName = "id", nullable = false)
    public ChatRoom getChatRoomByIdChatRoom() {
        return chatRoomByIdChatRoom;
    }

    public void setChatRoomByIdChatRoom(ChatRoom chatRoomByIdChatRoom) {
        this.chatRoomByIdChatRoom = chatRoomByIdChatRoom;
    }
}
