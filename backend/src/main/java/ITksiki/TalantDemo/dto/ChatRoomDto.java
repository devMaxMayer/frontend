package ITksiki.TalantDemo.dto;

import ITksiki.TalantDemo.entity.ChatRoom;
import ITksiki.TalantDemo.entity.ChatRoomUser;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Collection;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChatRoomDto {
    //список участников как название диалога
    private Collection<ChatRoomUser> chatRoomUsers;

    public ChatRoom toChatRoom() {
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.setChatRoomUsers(chatRoomUsers);

        return chatRoom;
    }

    public ChatRoomDto fromChatRoom(ChatRoom chatRoom) {
        ChatRoomDto chatRoomDto = new ChatRoomDto();
        chatRoom.setChatRoomUsers(chatRoom.getChatRoomUsers());

        return chatRoomDto;
    }
}
