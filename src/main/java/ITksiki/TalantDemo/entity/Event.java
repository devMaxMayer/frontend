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
    private EventType eventType;
    private Collection<UserEvent> userEvents;

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
    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventTypeByIdEventType) {
        this.eventType = eventTypeByIdEventType;
    }

    @OneToMany(mappedBy = "event")
    public Collection<UserEvent> getUserEvents() {
        return userEvents;
    }

    public void setUserEvents(Collection<UserEvent> userEventsById) {
        this.userEvents = userEventsById;
    }
}
