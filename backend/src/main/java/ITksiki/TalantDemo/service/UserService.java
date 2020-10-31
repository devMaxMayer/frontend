package ITksiki.TalantDemo.service;



import ITksiki.TalantDemo.entity.User;

import java.util.List;

public interface UserService {

    User register(User user);

    List<User> getAll();

    User findByName(String username);

    User findById(Long id);

    void disable(Long id);
}
