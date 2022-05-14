package com.csi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.security.PrivateKey;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

   @Id
   @GeneratedValue
   private int userId;

   private String userName;

   private String userAddress;






}
