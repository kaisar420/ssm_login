package top.sweetheart.dao;

import org.springframework.stereotype.Service;
import top.sweetheart.entity.User;

@Service
public interface IUserDao {
    User login(User user);
}
