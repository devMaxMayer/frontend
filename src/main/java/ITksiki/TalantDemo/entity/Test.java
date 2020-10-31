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
public class Test extends BaseEntity {
    private String name;
    private String description;
    private Collection<Question> questions;
    private Collection<UserTest> userTests;

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @OneToMany(mappedBy = "test")
    public Collection<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Collection<Question> questionsById) {
        this.questions = questionsById;
    }

    @OneToMany(mappedBy = "test")
    public Collection<UserTest> getUserTests() {
        return userTests;
    }

    public void setUserTests(Collection<UserTest> userTestsById) {
        this.userTests = userTestsById;
    }
}
