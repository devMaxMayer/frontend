package ITksiki.TalantDemo.dto;

import ITksiki.TalantDemo.entity.Test;
import ITksiki.TalantDemo.entity.User;
import ITksiki.TalantDemo.entity.UserTest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.sql.Date;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserTestDto {
    private Date dateStart;
    private Date dateFinish;
    private User user;
    private Test test;

    public  UserTest toUserTest() {
        UserTest userTest = new UserTest();
        userTest.setDateStart(dateStart);
        userTest.setDateFinish(dateFinish);
        userTest.setUser(user);
        userTest.setTest(test);

        return userTest;
    }

    public static UserTestDto fromUserTestDto(UserTest userTest){
        UserTestDto userTestDto = new UserTestDto();
        userTestDto.setDateStart(userTest.getDateStart());
        userTestDto.setDateFinish(userTest.getDateFinish());
        userTestDto.setUser(userTest.getUser());
        userTestDto.setTest(userTest.getTest());

        return userTestDto;
    }

}
