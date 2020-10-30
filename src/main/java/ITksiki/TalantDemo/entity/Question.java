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
public class Question extends BaseEntity {
    private String name;
    private long order;
    private String text;
    private Long cost;
    private Collection<Answer> answersById;
    private Test testByIdTest;
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

    @OneToMany(mappedBy = "questionByIdQuestion")
    public Collection<Answer> getAnswersById() {
        return answersById;
    }

    public void setAnswersById(Collection<Answer> answersById) {
        this.answersById = answersById;
    }

    @ManyToOne
    @JoinColumn(name = "id_test", referencedColumnName = "id", nullable = false)
    public Test getTestByIdTest() {
        return testByIdTest;
    }

    public void setTestByIdTest(Test testByIdTest) {
        this.testByIdTest = testByIdTest;
    }

    @OneToMany(mappedBy = "questionByIdQuestion")
    public Collection<UserQuestion> getUserQuestionsById() {
        return userQuestionsById;
    }

    public void setUserQuestionsById(Collection<UserQuestion> userQuestionsById) {
        this.userQuestionsById = userQuestionsById;
    }
}
