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
    private Question questionByIdQuestion;
    private Collection<UserQuestion> userQuestionsById;


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
    public Question getQuestionByIdQuestion() {
        return questionByIdQuestion;
    }

    public void setQuestionByIdQuestion(Question questionByIdQuestion) {
        this.questionByIdQuestion = questionByIdQuestion;
    }

    @OneToMany(mappedBy = "answerByIdAnswer")
    public Collection<UserQuestion> getUserQuestionsById() {
        return userQuestionsById;
    }

    public void setUserQuestionsById(Collection<UserQuestion> userQuestionsById) {
        this.userQuestionsById = userQuestionsById;
    }
}
