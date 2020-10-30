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
    private Collection<Question> questionsById;
    private Collection<UserTest> userTestsById;

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

    @OneToMany(mappedBy = "testByIdTest")
    public Collection<Question> getQuestionsById() {
        return questionsById;
    }

    public void setQuestionsById(Collection<Question> questionsById) {
        this.questionsById = questionsById;
    }

    @OneToMany(mappedBy = "testByIdTest")
    public Collection<UserTest> getUserTestsById() {
        return userTestsById;
    }

    public void setUserTestsById(Collection<UserTest> userTestsById) {
        this.userTestsById = userTestsById;
    }
}
