package top.sweetheart.service;

import org.springframework.stereotype.Service;
import top.sweetheart.dao.IUserDao;
import top.sweetheart.entity.User;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public User login(User user) {
        return userDao.login(user);
    }
}
