package ITksiki.TalantDemo.entity;

import ITksiki.TalantDemo.enums.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.apache.commons.collections4.CollectionUtils;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.stream.Collectors;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "user", schema = "public", catalog = "talant")
public class User extends BaseEntity {
    private String name;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private Timestamp created;
    private Timestamp update;
    private ITksiki.TalantDemo.enums.Status status;
    private Collection<ChatRoom> chatRooms;
    private Collection<ChatRoomUser> chatRoomUsers;
    private Collection<Message> messages;
    private Collection<UserEvent> userEvents;
    private Collection<UserQuestion> userQuestions;
    private Collection<UserRole> userRoles;
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
    @Enumerated(EnumType.STRING)
    public ITksiki.TalantDemo.enums.Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @OneToMany(mappedBy = "user")
    public Collection<ChatRoom> getChatRooms() {
        return chatRooms;
    }

    public void setChatRooms(Collection<ChatRoom> chatRoomsById) {
        this.chatRooms = chatRoomsById;
    }

    @OneToMany(mappedBy = "user")
    public Collection<ChatRoomUser> getChatRoomUsers() {
        return chatRoomUsers;
    }

    public void setChatRoomUsers(Collection<ChatRoomUser> chatRoomUsersById) {
        this.chatRoomUsers = chatRoomUsersById;
    }

    @OneToMany(mappedBy = "user")
    public Collection<Message> getMessages() {
        return messages;
    }

    public void setMessages(Collection<Message> messagesById) {
        this.messages = messagesById;
    }

    @OneToMany(mappedBy = "user")
    public Collection<UserEvent> getUserEvents() {
        return userEvents;
    }

    public void setUserEvents(Collection<UserEvent> userEventsById) {
        this.userEvents = userEventsById;
    }

    @OneToMany(mappedBy = "user")
    public Collection<UserQuestion> getUserQuestions() {
        return userQuestions;
    }

    public void setUserQuestions(Collection<UserQuestion> userQuestionsById) {
        this.userQuestions = userQuestionsById;
    }

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    public Collection<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Collection<UserRole> userRolesById) {
        this.userRoles = userRolesById;
    }

    @OneToMany(mappedBy = "user")
    public Collection<UserTest> getUserTests() {
        return userTests;
    }

    public void setUserTests(Collection<UserTest> userTestsById) {
        this.userTests = userTestsById;
    }

    @Transient
    public Collection<Role> getRoles (){
        if (CollectionUtils.isEmpty(userRoles)) {
            return CollectionUtils.emptyCollection();
        }
        return userRoles.stream().map(ur -> ur.getRole()).collect(Collectors.toList());
    }
}
