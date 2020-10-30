package ITksiki.TalantDemo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@Entity
public class User extends BaseEntity {
    private String name;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private Timestamp created;
    private Timestamp update;
    private String status;
    private Collection<ChatRoom> chatRoomsById;
    private Collection<ChatRoomUser> chatRoomUsersById;
    private Collection<Message> messagesById;
    private Collection<UserEvent> userEventsById;
    private Collection<UserQuestion> userQuestionsById;
    private Collection<UserRole> userRolesById;
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
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "created")
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Basic
    @Column(name = "update")
    public Timestamp getUpdate() {
        return update;
    }

    public void setUpdate(Timestamp update) {
        this.update = update;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @OneToMany(mappedBy = "userByIdCreatorUser")
    public Collection<ChatRoom> getChatRoomsById() {
        return chatRoomsById;
    }

    public void setChatRoomsById(Collection<ChatRoom> chatRoomsById) {
        this.chatRoomsById = chatRoomsById;
    }

    @OneToMany(mappedBy = "userByIdUser")
    public Collection<ChatRoomUser> getChatRoomUsersById() {
        return chatRoomUsersById;
    }

    public void setChatRoomUsersById(Collection<ChatRoomUser> chatRoomUsersById) {
        this.chatRoomUsersById = chatRoomUsersById;
    }

    @OneToMany(mappedBy = "userByIdUser")
    public Collection<Message> getMessagesById() {
        return messagesById;
    }

    public void setMessagesById(Collection<Message> messagesById) {
        this.messagesById = messagesById;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<UserEvent> getUserEventsById() {
        return userEventsById;
    }

    public void setUserEventsById(Collection<UserEvent> userEventsById) {
        this.userEventsById = userEventsById;
    }

    @OneToMany(mappedBy = "userByIdUser")
    public Collection<UserQuestion> getUserQuestionsById() {
        return userQuestionsById;
    }

    public void setUserQuestionsById(Collection<UserQuestion> userQuestionsById) {
        this.userQuestionsById = userQuestionsById;
    }

    @OneToMany(mappedBy = "userByIdUser")
    public Collection<UserRole> getUserRolesById() {
        return userRolesById;
    }

    public void setUserRolesById(Collection<UserRole> userRolesById) {
        this.userRolesById = userRolesById;
    }

    @OneToMany(mappedBy = "userByIdUser")
    public Collection<UserTest> getUserTestsById() {
        return userTestsById;
    }

    public void setUserTestsById(Collection<UserTest> userTestsById) {
        this.userTestsById = userTestsById;
    }
}
