package com.csi.service;

import com.csi.dao.UserDaoImpl;
import com.csi.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl {


    @Autowired
    UserDaoImpl userDaoImpl;

    public User saveData(User user)
    {
        log.info("***********Get User Name**********"+user.getUserName());

        return userDaoImpl.saveData(user);
    }
    public List<User> getAllData(){
        log.info("***********Get User Address**********");

        return userDaoImpl.getAllData();
    }
    public List<User> getDataByAddress(String userAddress)
    {
        log.info("***********Get User Address**********"+userAddress);

        return userDaoImpl.getDataByAddress(userAddress);
    }

    public List<User> getDataByName(String userName)
    {
        log.info("***********Get User Name**********"+userName);

        return userDaoImpl.getDataByName(userName);
    }

    public void deleteAllData()
    {
        userDaoImpl.deleteAllData();
    }
}
