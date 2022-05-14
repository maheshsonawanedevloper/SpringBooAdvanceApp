package com.csi.controller;

import com.csi.model.User;
import com.csi.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/v1")
public class UserController {
    @Autowired
    UserServiceImpl userServiceImpl;

    @PostMapping("/saveData")
            public ResponseEntity<User> saveData(@RequestBody User user)

    {
       return ResponseEntity.ok(userServiceImpl.saveData(user));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAllData()
    {
       return ResponseEntity.ok(userServiceImpl.getAllData());
    }
    @GetMapping("/getdatabyaddress/{userAddress}")
    public ResponseEntity<List<User>> getDataByAddress(@PathVariable String userAddress)

    {
        return ResponseEntity.ok(userServiceImpl.getDataByAddress(userAddress));
    }

    @GetMapping("/getByName/{userName}")
    public ResponseEntity<List<User>> getByName(@PathVariable String userName)
    {
       return ResponseEntity.ok(userServiceImpl.getDataByName(userName));
    }

    @DeleteMapping("/deleteAll")
    public ResponseEntity<String> DeleteAllData()
    {
        userServiceImpl.deleteAllData();
        return ResponseEntity.ok("All data deleted");
    }
}
