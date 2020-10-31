package ITksiki.TalantDemo.controller;

import ITksiki.TalantDemo.dto.QuestionToAnswerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/question/")
public class QuestionController {

    @PostMapping("question-start")
    public void questionStart(@RequestBody Long idQuestion) {

    }

    @PostMapping("question-answer")
    public void questionAnswer(@RequestBody QuestionToAnswerDto answer) {

    }

    @GetMapping("questions")
    public void questions(@RequestParam Long idTest) {

    }

    @GetMapping("answers")
    public void answers(@RequestParam Long idQuestion) {

    }

}