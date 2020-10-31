package ITksiki.TalantDemo.controller;

import ITksiki.TalantDemo.dto.BaseDto;
import ITksiki.TalantDemo.dto.MessageFromUserDto;
import ITksiki.TalantDemo.service.ChatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/chat/")
public class ChatController {

    private final ChatService chatService;

    @Autowired
    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping("create-chat")
    public void createСhat(@RequestBody BaseDto userWithWhom) {
        chatService.createPersonalChat(userWithWhom.getId());
    }

    @GetMapping("my-chats")
    public void myChats() {

    }

    @GetMapping("chat")
    public void chat(@RequestParam Long idChat) {

    }

    @PostMapping("send-message")
    public void sendMessage(@RequestBody MessageFromUserDto message) {

    }
}