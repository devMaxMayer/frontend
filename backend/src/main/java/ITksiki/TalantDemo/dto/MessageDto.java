package ITksiki.TalantDemo.dto;


import ITksiki.TalantDemo.entity.Message;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageDto {
    private String messageText;

    public Message toMessage(){
       Message message = new Message();
       message.setMessage(messageText);

        return message;
    }

    public static MessageDto fromMassage(Message massage) {
       MessageDto messageDto = new MessageDto();
       messageDto.setMessageText(massage.getMessage());

        return messageDto;
    }
}
