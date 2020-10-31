package ITksiki.TalantDemo.dto;

import ITksiki.TalantDemo.entity.Question;
import ITksiki.TalantDemo.entity.Test;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Collection;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestDto {
    private String name;
    private String description;
    private Collection<Question> questions;

    public Test toTest(){
        Test test = new Test();
        test.setName(name);
        test.setDescription(description);
        test.setQuestions(questions);

        return test;
    }

    public TestDto fromTest(){
        TestDto testDto = new TestDto();
        testDto.setName(testDto.getName());
        testDto.setDescription(testDto.getDescription());
        testDto.setQuestions(testDto.getQuestions());

        return testDto;
    }
}
