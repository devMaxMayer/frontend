package ITksiki.TalantDemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/event/")
public class EventController {


    @PostMapping("subscribe-event")
    public void subscribeEvent(@RequestBody Long idEvent) {

    }

    @GetMapping("all-events")
    public void allEvents() {

    }

    @GetMapping("my-events")
    public void myEvent() {

    }

}