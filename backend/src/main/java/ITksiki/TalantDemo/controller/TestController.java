package ITksiki.TalantDemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/test/")
public class TestController {

    @PostMapping("test-start")
    public void testStart(@RequestBody Long idTest) {

    }

    @GetMapping("all-tests")
    public void allTests() {

    }

    @GetMapping("my-tests")
    public void myTests() {

    }

    @GetMapping("test")
    public void getTest(@RequestParam Long idTest) {

    }
}