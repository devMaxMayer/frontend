package ITksiki.TalantDemo.entity;

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
@Table(name = "chat_room", schema = "public", catalog = "talant")
public class ChatRoom extends BaseEntity {
    private User userByIdCreatorUser;
    private ChatRoomType chatRoomTypeByIdChatRoomType;
    private Collection<ChatRoomUser> chatRoomUsersById;
    private Collection<Message> messagesById;

    @ManyToOne
    @JoinColumn(name = "id_creator_user", referencedColumnName = "id", nullable = false)
    public User getUserByIdCreatorUser() {
        return userByIdCreatorUser;
    }

    public void setUserByIdCreatorUser(User userByIdCreatorUser) {
        this.userByIdCreatorUser = userByIdCreatorUser;
    }

    @ManyToOne
    @JoinColumn(name = "id_chat_room_type", referencedColumnName = "id", nullable = false)
    public ChatRoomType getChatRoomTypeByIdChatRoomType() {
        return chatRoomTypeByIdChatRoomType;
    }

    public void setChatRoomTypeByIdChatRoomType(ChatRoomType chatRoomTypeByIdChatRoomType) {
        this.chatRoomTypeByIdChatRoomType = chatRoomTypeByIdChatRoomType;
    }

    @OneToMany(mappedBy = "chatRoomByIdChatRoom")
    public Collection<ChatRoomUser> getChatRoomUsersById() {
        return chatRoomUsersById;
    }

    public void setChatRoomUsersById(Collection<ChatRoomUser> chatRoomUsersById) {
        this.chatRoomUsersById = chatRoomUsersById;
    }

    @OneToMany(mappedBy = "chatRoomByIdChatRoom")
    public Collection<Message> getMessagesById() {
        return messagesById;
    }

    public void setMessagesById(Collection<Message> messagesById) {
        this.messagesById = messagesById;
    }
}
