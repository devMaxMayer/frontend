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
@Table(name = "user_test", schema = "public", catalog = "talant")
public class UserTest extends BaseEntity {
    private Date dateStart;
    private Date dateFinish;
    private User user;
    private Test test;

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
    @JoinColumn(name = "id_test", referencedColumnName = "id", nullable = false)
    public Test getTest() {
        return test;
    }

    public void setTest(Test testByIdTest) {
        this.test = testByIdTest;
    }
}
