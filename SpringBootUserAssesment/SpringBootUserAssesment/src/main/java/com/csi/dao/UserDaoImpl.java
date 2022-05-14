package com.csi.dao;

import com.csi.model.User;
import com.csi.repo.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class UserDaoImpl {
    @Autowired
    UserRepository userRepositoryImpl;


    public User saveData(User user)
    {    log.info("***********Get User Name**********"+user.getUserName());
        return userRepositoryImpl.save(user);
    }
    public List<User> getAllData(){
        log.info("***********Get User Address**********");

        return userRepositoryImpl.findAll();
    }
    public List<User> getDataByAddress(String userAddress)
    {
        log.info("***********Get User Address**********"+userAddress);

        return  userRepositoryImpl.findByUserAddress(userAddress);
    }

    public List<User> getDataByName(String userName)
    {
        log.info("***********Get User Name**********"+userName);

        return userRepositoryImpl.findByUserName(userName);
    }

    public void deleteAllData()
    {
        userRepositoryImpl.deleteAll();
    }
}
