package ITksiki.TalantDemo.dto;

import ITksiki.TalantDemo.entity.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuestionDto {
    private String name;
    private long order;
    private String text;

    public Question toQuestion(){
        Question question = new Question();
        question.setName(name);
        question.setOrder(order);
        question.setText(text);

        return question;

    }

        public QuestionDto fromQuestion(){
            QuestionDto questionDto = new QuestionDto();
            questionDto.setName(questionDto.getName());
            questionDto.setOrder(questionDto.getOrder());
            questionDto.setOrder(questionDto.getOrder());

            return questionDto;
    }
}
