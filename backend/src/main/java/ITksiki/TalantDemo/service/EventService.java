package ITksiki.TalantDemo.service;


import ITksiki.TalantDemo.entity.Event;

import java.util.List;

public interface EventService {


    List<Event> findAll();

    Event findById(Long id);

    Event save (Event event);

    void deleteById(Long id);

}
