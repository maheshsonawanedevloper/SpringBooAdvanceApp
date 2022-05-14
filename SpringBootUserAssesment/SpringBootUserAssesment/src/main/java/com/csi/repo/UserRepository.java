package com.csi.repo;

import com.csi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository  extends JpaRepository<User,Integer> {


    public List<User> findByUserAddress(String userAddress);

    public List<User> findByUserName(String userName);




}
