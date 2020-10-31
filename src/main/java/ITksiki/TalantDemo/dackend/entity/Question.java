package ITksiki.TalantDemo.dackend.entity;

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
@Table(name = "question", schema = "public", catalog = "talant")
public class Question extends BaseEntity {
    private String name;
    private long order;
    private String text;
    private Long cost;
    private Test test;
    private Collection<Answer> answers;
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
    @Column(name = "order")
    public long getOrder() {
        return order;
    }

    public void setOrder(long order) {
        this.order = order;
    }

    @Basic
    @Column(name = "text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Basic
    @Column(name = "cost")
    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    @OneToMany(mappedBy = "question")
    public Collection<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Collection<Answer> answersById) {
        this.answers = answersById;
    }

    @ManyToOne
    @JoinColumn(name = "id_test", referencedColumnName = "id", nullable = false)
    public Test getTest() {
        return test;
    }

    public void setTest(Test testByIdTest) {
        this.test = testByIdTest;
    }

    @OneToMany(mappedBy = "question")
    public Collection<UserQuestion> getUserQuestions() {
        return userQuestions;
    }

    public void setUserQuestions(Collection<UserQuestion> userQuestionsById) {
        this.userQuestions = userQuestionsById;
    }
}
