package ITksiki.TalantDemo.dackend.entity;

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
    private User user;
    private Question question;
    private Answer answer;

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
    public User getUser() {
        return user;
    }

    public void setUser(User userByIdUser) {
        this.user = userByIdUser;
    }

    @ManyToOne
    @JoinColumn(name = "id_question", referencedColumnName = "id", nullable = false)
    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question questionByIdQuestion) {
        this.question = questionByIdQuestion;
    }

    @ManyToOne
    @JoinColumn(name = "id_answer", referencedColumnName = "id")
    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answerByIdAnswer) {
        this.answer = answerByIdAnswer;
    }
}
