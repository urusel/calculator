/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.models.User;
import java.sql.ResultSet;
import java.util.*;
import javax.swing.tree.RowMapper;

/**
 *
 * @author user
 */
public class UsersDaoJdbcTemplatelmpl implements UsersDao{
 private JdbcTemplate template;
 private final String SQL_SELECT_ALL="SELECT * FROMfix_user";
 private Map<Integer, User> usersMap=new HashMap<>();
 private final String SQL_SELECT_USER=
         "SELECT * FROMfix_user WHERE fix_user.id=?";
 private final String SQL_SELECT_ALL_BY_FIRST_NAME=
         "SELECT * FROMfix_user WHERE first_name=?";
 
 public  UsersDaoJdbcTemplateImpl(DataSouse dataSouse){
     this.template=new  JdbcTemplate(dataSouse);
 }
 private RowMapper<User> userRowMapper
         =(ResultSet resultSet, int i)->{
             Integer id=resultSet.getInt("id");
             
             if(!usersMap.containsKey(id)){
              String firstName=resultSet.getString("first_name");
              String lastName=resultSet.getString("last_name");
            User user=new User(id, firstName, lastName);
            usersMap.put(id, user);
             }
             return usersMap.get(id);
         };
 
         }



