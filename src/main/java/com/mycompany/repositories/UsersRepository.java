package com.mycompany.repositories;

import com.mycompany.models.User;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public interface UsersRepository {
    List<User> findAll();
    void save (User user);
    boolean isExist(String name, String password);
}
