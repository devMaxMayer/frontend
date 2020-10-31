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
@Table(name = "event_type", schema = "public", catalog = "talant")
public class EventType extends BaseEntity {
    private String name;
    private Collection<Event> events;

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "eventType")
    public Collection<Event> getEvents() {
        return events;
    }

    public void setEvents(Collection<Event> eventsById) {
        this.events = eventsById;
    }
}
