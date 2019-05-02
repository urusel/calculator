/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fake;

import com.mycompany.models.User;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class FakeStorage {
    private static final FakeStorage storage;
    static  {
        storage = new FakeStorage();
    }
        private List<User> users;
        private FakeStorage() {
        this.users = new ArrayList<>();
        User user = new User("Kirill", "222", LocalDate.parse("1975-02-02"));
        User user1 = new User("Trofim", "222", LocalDate.parse("1985-02-02"));
        User user2 = new User("Valentina", "222", LocalDate.parse("1995-02-02"));
        users.add(user);
        users.add(user1);
        users.add(user2);
}
public static FakeStorage storage(){
return storage;
}
public List<User> users(){
return users;
    }
    
    
}
