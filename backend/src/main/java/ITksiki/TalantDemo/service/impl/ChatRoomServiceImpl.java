package ITksiki.TalantDemo.service.impl;


import ITksiki.TalantDemo.entity.ChatRoom;
import ITksiki.TalantDemo.entity.ChatRoomType;
import ITksiki.TalantDemo.entity.ChatRoomUser;
import ITksiki.TalantDemo.entity.User;
import ITksiki.TalantDemo.repository.ChatRoomRepository;
import ITksiki.TalantDemo.repository.ChatRoomUserRepository;
import ITksiki.TalantDemo.service.ChatService;
import ITksiki.TalantDemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class ChatRoomServiceImpl implements ChatService {

    private final UserService userService;
    private final ChatRoomRepository chatRoomRepository;
    private final ChatRoomUserRepository chatRoomUserRepository;

    @Autowired
    public ChatRoomServiceImpl(UserService userService,
                               ChatRoomRepository chatRoomRepository,
                               ChatRoomUserRepository chatRoomUserRepository) {
        this.userService = userService;
        this.chatRoomRepository = chatRoomRepository;
        this.chatRoomUserRepository = chatRoomUserRepository;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void createPersonalChat(Long idUserWithWhom) {
        User currentUser = userService.currentUser();
        User userWithWhom = userService.findById(idUserWithWhom);
        if (currentUser.equals(userWithWhom)) {
            throw new RuntimeException("Нельзя создавать чат с самим собой");
        }
        Boolean checkChat = chatRoomRepository.checkChat(currentUser.getId(), userWithWhom.getId(), ChatRoomType.PERSONAL.getId()); // проверка на существование такого чата
        if (checkChat != null && checkChat) {
            throw new RuntimeException("Чат с этим пользователем уже существует");
        }
        ChatRoom chatRoom = createChatRoom(currentUser);
        createChatRoomUser(chatRoom, currentUser);
        createChatRoomUser(chatRoom, userWithWhom);
    }

    private void createChatRoomUser(ChatRoom chatRoom, User currentUser) {
        ChatRoomUser chatRoomUser = ChatRoomUser.builder()
                .chatRoom(chatRoom)
                .user(currentUser)
                .build();
        chatRoomUserRepository.save(chatRoomUser);
    }

    private ChatRoom createChatRoom(User currentUser) {
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.setCreatorUser(currentUser);
        chatRoom.setChatRoomType(ChatRoomType.PERSONAL);
        return chatRoomRepository.save(chatRoom);
    }
}