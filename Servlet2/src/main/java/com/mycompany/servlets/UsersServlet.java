/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
           
           connection=DriverManager.getConnection(dbUrl,db.username,password );
           
        }catch(IOException | SQLException | ClassNotFoundException e){
            throw new IllegalStateException(e);
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        req.getServletContext().getRequedtDispatcher("/jsp/addUser.jsp").forwad(req, resp);
    }
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
   String firstName=req.getParameter("first-name");
    String lastName=req.getParameter("last-name");
    
    try{
        PreparedStatement preparedStatement=
                connection.prepareStatement("INSERT INFO " + "fix_user (first_name, last_name) VALUES (?, ?");
       preparedStatement.setString(1, firstName);
        preparedStatement.setString(2, lastName);
        preparedStatement.execute();
    }catch (SQLException e){
        throw new IllegalStateException();
    }
    }
}
    

