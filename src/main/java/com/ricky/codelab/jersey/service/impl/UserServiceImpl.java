package com.ricky.codelab.jersey.service.impl;

import com.ricky.codelab.jersey.domain.User;
import com.ricky.codelab.jersey.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-07-20 14:30
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    private AtomicLong counter = new AtomicLong(1);

    public long insert(User user) {

        return counter.getAndIncrement();
    }

    public List<User> getUserList() {

        List<User> userList = new ArrayList<User>();
        for(int i=0;i<10;i++){

            User user = new User();
            user.setId(counter.getAndIncrement());
            user.setName("abc_"+i);
            user.setAge(25);

            userList.add(user);
        }

        return userList;
    }

    public User findUserById(long id) {
        User user = new User();
        user.setId(id);
        user.setName("ricky");
        user.setAge(27);

        return user;
    }

    public User findUserByName(String username) {

        User user = new User();
        user.setId(counter.getAndIncrement());
        user.setName(username);
        user.setAge(25);

        return user;
    }

    public int update(User user) {

        return 1;
    }

    public int delete() {
        return (int) counter.get();
    }

    public int deleteById(long id) {
        return 1;
    }
}
