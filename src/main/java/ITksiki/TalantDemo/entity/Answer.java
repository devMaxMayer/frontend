package ITksiki.TalantDemo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "answer", schema = "public", catalog = "talant")
public class Answer extends BaseEntity {
    private String name;
    private boolean correct;
    private Question question;
    private Collection<UserQuestion> userQuestions;


    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "correct")
    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    @ManyToOne
    @JoinColumn(name = "id_question", referencedColumnName = "id", nullable = false)
    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question questionByIdQuestion) {
        this.question = questionByIdQuestion;
    }

    @OneToMany(mappedBy = "answer")
    public Collection<UserQuestion> getUserQuestions() {
        return userQuestions;
    }

    public void setUserQuestions(Collection<UserQuestion> userQuestionsById) {
        this.userQuestions = userQuestionsById;
    }
}
