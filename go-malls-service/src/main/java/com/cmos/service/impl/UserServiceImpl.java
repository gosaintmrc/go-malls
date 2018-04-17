package com.cmos.service.impl;

import java.util.List;

import com.cmos.domain.User;
import com.cmos.repository.UserRepository;
import com.cmos.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 13:35 2018/4/12
 * @Modified By:
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void addUser(final User user) {
        userRepository.save(user);
    }

    public void deleteUser(final Long id) {
       /* userRepository.delete(id);*/
    }

    public void updateUser(final User user) {
       userRepository.saveAndFlush(user);
    }
}
