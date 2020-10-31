package ITksiki.TalantDemo.dackend.controller;

import ITksiki.TalantDemo.dackend.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/main")
public class MainRestController {
    @GetMapping("/{id}")

    public User getById(@PathVariable Long id){
        return null;
    }
}
