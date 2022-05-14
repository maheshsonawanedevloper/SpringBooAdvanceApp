package com.csi.test;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.csi.dao.UserDaoImpl;
import com.csi.model.User;
import com.csi.repo.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;




@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoImplTest {

    @Autowired
    UserDaoImpl userDaoImpl;
    @MockBean
    UserRepository userRepositoryImpl;


    @Test
    public void saveDataTest() {
        User user = new User(21, "fff", "ff");
        userDaoImpl.saveData(user);

        verify(userRepositoryImpl, times(1)).save(user);


    }

    @Test
    public void getAllTest() {

    }

   @Test
    public void getDataByAddress() {
        String userAddress = "uuuu";
        when(userRepositoryImpl.findByUserAddress(userAddress)).thenReturn(Stream.of(new User(121, "UU", "UU")).collect(Collectors.toList()));
        assertEquals(1, userDaoImpl.getDataByAddress(userAddress).size());

    }

    @Test
    public void getDataByName() {


    }
}
