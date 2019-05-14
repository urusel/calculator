/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scanner=new Scanner(System.in);
        String className= scanner.next();
        Class aClass=Class.forName(className);
        
        Field fields[]=aClass.getFields();
        
        for(Field field : fields){
            System.out.println(field.getType() + "" + field.getName());
        }
        
        Class types[]=new Class[fields.length];
        
        for(int i=0;i<types.length;i++){
            types[i]=fields[i].getType();
        }
       Constructor constructor=aClass.getDeclaredConstructor(types);
       
       for(Class parameterType : constructor.getParameterTypes()){
         System.out.println(parameterType.getName() + "" );  
       }
       
       Integer intValue=0;
       String stringValue="";
       for(int i=0;i<types.length;i++){
           if(types[i].getName().equals("int")){
               intValue=scanner.nextInt();
       }else if(types[i].getName().equals("java.lang.String")){
               stringValue=scanner.next();
       }
        
    }
    Object arguments[]={intValue, stringValue};
    Object object=constructor.newInstance(arguments);
    System.out.println(object);
    }   
    
}
