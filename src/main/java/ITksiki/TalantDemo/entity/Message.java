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
    private User user;
    private ChatRoom chatRoom;

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
