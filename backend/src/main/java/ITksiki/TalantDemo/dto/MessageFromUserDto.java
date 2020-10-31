package ITksiki.TalantDemo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageFromUserDto {
    private Long chatId;
    private String message;
}