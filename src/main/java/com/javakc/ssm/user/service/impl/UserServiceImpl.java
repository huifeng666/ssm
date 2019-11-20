package com.javakc.ssm.user.service.impl;

import com.javakc.ssm.user.dao.UserDao;
import com.javakc.ssm.user.entity.User;
import com.javakc.ssm.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional(readOnly = false)
    @Override
    public int insert(User user) {
       return userDao.insert(user);
    }

    @Transactional(readOnly = false)
    @Override
    public int delete(String id) {
        return 0;
    }

    @Transactional(readOnly = false)
    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public long queryCount(User user) {
        return 0;
    }

    @Override
    public List<User> queryByPage(User user, int start, int end) {
        return null;
    }

    @Override
    public User queryById(String id) {
        return null;
    }
}
