package ITksiki.TalantDemo.controller;

import ITksiki.TalantDemo.dto.MessageFromUserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/chat/")
public class ChatController {

    @PostMapping("create-chat")
    public void createСhat(@RequestBody Long idUserWithWhom) {

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