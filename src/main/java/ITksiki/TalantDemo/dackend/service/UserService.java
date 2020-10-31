package ITksiki.TalantDemo.dackend.service;



import ITksiki.TalantDemo.dackend.entity.User;

import java.util.List;

public interface UserService {

    User register(User user);

    List<User> getAll();

    User findByName(String username);

    User findById(Long id);

    void disable(Long id);
}
