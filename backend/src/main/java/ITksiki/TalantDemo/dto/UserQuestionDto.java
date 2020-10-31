package ITksiki.TalantDemo.dto;

import ITksiki.TalantDemo.entity.Answer;
import ITksiki.TalantDemo.entity.Question;
import ITksiki.TalantDemo.entity.UserQuestion;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.sql.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserQuestionDto {
    private Date dateStart;
    private Date dateFinish;
    private Question question;
    private Answer answer;

    public UserQuestion toUserQuestion(){
        UserQuestion userQuestion = new UserQuestion();
        userQuestion.setDateStart(dateStart);
        userQuestion.setDateFinish(dateFinish);
        userQuestion.setQuestion(question);
        userQuestion.setAnswer(answer);

        return userQuestion;
    }

    public static UserQuestionDto fromUserQuestionDto(UserQuestion userQuestion){
        UserQuestionDto userQuestionDto = new UserQuestionDto();
        userQuestionDto.setDateStart(userQuestion.getDateStart());
        userQuestionDto.setDateFinish(userQuestion.getDateFinish());
        userQuestionDto.setAnswer(userQuestion.getAnswer());
        userQuestionDto.setQuestion(userQuestion.getQuestion());

        return userQuestionDto;
    }
}
