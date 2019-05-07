/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servlets;

import java.sql.Connection;

/**
 *
 * @author user
 */
@WebServlet("/addUser")
public class UsersServlet extends HttpServlet{
    private Connection connection;
    
    @Override
    public void int()throws ServletException{
        Properties properties=new Properties();
        
        try{
          properties.load(new FileImputStream(getServletContext().getRealPath("/WEB-INF/classes/db.properties")));
          
           String dbUrl= properties.getProperty("db.url");
           String dbUsername=properties.getProperty("db.username");
           String dbPassword=properties.getProperty("db.password");
           String driverClassName=properties.getProperty("db.driverClassName");
           
           Class.forName(drverClassName);
           
           
        }
    }
    
}
