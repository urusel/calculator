/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servlets;

import com.mycompany.dao.UsersDao;
import com.mycompany.dao.UsersDaoJdbcImpl;
import com.mycompany.models.User;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

/**
 *
 * @author user
 */
@WebServlet("/users")
public class UsersServletWithDao extends HttpServlet{
    private UsersDao usersDao;
    
    @Override
    public void init() throws ServletException{
        Properties properties=new Properties();
        DriverManagerDataSourse dataSourse
                =new DriverManagerDataSourse ();
        try{
            properties.load(new FileInputStream(getServletContext().getRealPath("/WEB-INF/classes/db.properties")));
            String dbUr1=properties.getProperty("db.url");
            String dbUsername=properties.getProperty("db.username");
            String dbPassword=properties.getProperty("db.password");
            String driverClassName=properties.getProperty("db.driverClassName");
            
            dataSource.setUsername(dbUsername);
            dataSource.setPassword(dbPassword);
            dataSource.setUr1(dbUr1);
            dataSource.setDriverClassName(driverClassName);
            
            usersDao=new UsersDaoJdbcImpl(dataSource);
            
        }catch(IOException e){
            throw new IllegalArgumentException(e);
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws SecurityException, IOException{
        
        Optional<User> user=userDao.find(2);
        int i=0;
        
        List<User> users=null;
        if(req.getParameter("firstName") !=null){
            String firstName=req.getParameter("firstName");
            users=usersDao.findAllByFirstName(firstName);
        }else{
            users=usersDao.findAll();
        }
        req.setAttribute("usersFromServer", users);
        req.getServletContext().getRequestDispatcher("/jsp/users.jsp").forward(req, resp);
    }
    
    }

