package ITksiki.TalantDemo.dto;

import ITksiki.TalantDemo.entity.Answer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnswerDto {
    private String name;

    public Answer toAnswer() {
        Answer answer = new Answer();
        answer.setName(name);
        return answer;
    }


    public static AnswerDto fromAnswer(Answer answer) {
        AnswerDto answerDto = new AnswerDto();
        answerDto.setName(answer.getName());

        return answerDto;
    }
}
