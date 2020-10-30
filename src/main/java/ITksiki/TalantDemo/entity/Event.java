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
public class Event extends BaseEntity {
    private String name;
    private String status;
    private EventType eventTypeByIdEventType;
    private Collection<UserEvent> userEventsById;

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @ManyToOne
    @JoinColumn(name = "id_event_type", referencedColumnName = "id", nullable = false)
    public EventType getEventTypeByIdEventType() {
        return eventTypeByIdEventType;
    }

    public void setEventTypeByIdEventType(EventType eventTypeByIdEventType) {
        this.eventTypeByIdEventType = eventTypeByIdEventType;
    }

    @OneToMany(mappedBy = "eventByEventId")
    public Collection<UserEvent> getUserEventsById() {
        return userEventsById;
    }

    public void setUserEventsById(Collection<UserEvent> userEventsById) {
        this.userEventsById = userEventsById;
    }
}
