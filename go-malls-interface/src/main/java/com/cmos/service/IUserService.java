package com.cmos.service;

import java.util.List;

import com.cmos.domain.User;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 13:29 2018/4/12
 * @Modified By:
 */
public interface IUserService {
    /**
     * 查询所有的用户
     * @param
     * @return
     */
    List<User> findAll();
    void addUser(User user);
    void deleteUser(Long id);
    void updateUser(User user);
}
