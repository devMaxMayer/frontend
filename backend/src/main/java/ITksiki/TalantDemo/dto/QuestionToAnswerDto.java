package ITksiki.TalantDemo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuestionToAnswerDto {
    private Long questionId;
    private Long answerId;
}