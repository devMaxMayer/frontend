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
@Table(name = "chat_room_type", schema = "public", catalog = "talant")
public class ChatRoomType extends BaseEntity {

    public static final ChatRoomType PERSONAL = new ChatRoomType(1L, "PERSONAL");
    public static final ChatRoomType GROUP = new ChatRoomType(2L, "GROUP");

    public ChatRoomType(Long id, String name) {
        super(id);
        this.name = name;
    }
    private String name;

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
