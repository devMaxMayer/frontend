package ITksiki.TalantDemo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "user_question", schema = "public", catalog = "talant")
public class UserQuestion extends BaseEntity {
    private Date dateStart;
    private Date dateFinish;
    private User userByIdUser;
    private Question questionByIdQuestion;
    private Answer answerByIdAnswer;

    @Basic
    @Column(name = "date_start")
    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    @Basic
    @Column(name = "date_finish")
    public Date getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(Date dateFinish) {
        this.dateFinish = dateFinish;
    }

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id", nullable = false)
    public User getUserByIdUser() {
        return userByIdUser;
    }

    public void setUserByIdUser(User userByIdUser) {
        this.userByIdUser = userByIdUser;
    }

    @ManyToOne
    @JoinColumn(name = "id_question", referencedColumnName = "id", nullable = false)
    public Question getQuestionByIdQuestion() {
        return questionByIdQuestion;
    }

    public void setQuestionByIdQuestion(Question questionByIdQuestion) {
        this.questionByIdQuestion = questionByIdQuestion;
    }

    @ManyToOne
    @JoinColumn(name = "id_answer", referencedColumnName = "id")
    public Answer getAnswerByIdAnswer() {
        return answerByIdAnswer;
    }

    public void setAnswerByIdAnswer(Answer answerByIdAnswer) {
        this.answerByIdAnswer = answerByIdAnswer;
    }
}
