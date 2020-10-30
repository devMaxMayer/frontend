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
@Table(name = "chat_room_type", schema = "public", catalog = "talant")
public class ChatRoomType extends BaseEntity {
    private String name;
    private Collection<ChatRoom> chatRoomsById;

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @OneToMany(mappedBy = "chatRoomTypeByIdChatRoomType")
    public Collection<ChatRoom> getChatRoomsById() {
        return chatRoomsById;
    }

    public void setChatRoomsById(Collection<ChatRoom> chatRoomsById) {
        this.chatRoomsById = chatRoomsById;
    }
}
