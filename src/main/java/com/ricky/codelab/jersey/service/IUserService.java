package com.ricky.codelab.jersey.service;

import com.ricky.codelab.jersey.domain.User;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-07-20 14:30
 */
public interface IUserService {

    long insert(User user);

    List<User> getUserList();

    User findUserById(long id);

    User findUserByName(String username);

    int update(User user);

    int delete();   //全部删除

    int deleteById(long id);
}
