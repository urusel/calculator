/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo;

import java.lang.reflect.Field;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) throws Exception {
        SomeClass someObject=new SomeClass();
        Class<SomeClass> someClassAsClass=(Class<SomeClass>) someObject.getClass();
        
       Field someField=someClassAsClass.getField("someField");
        System.out.println(someField.getType());
        
        Field[] fields=someClassAsClass.getFields();
        for(Field field : fields){
            System.out.println(someObject.someField);
            someField.set(someObject, 777);
    
        
    System.out.println(someObject.someField);
    
    Field privateField=someClassAsClass.getDeclaredField("somePrivate");
    System.out.println(privateField.getName());
    
 privateField.setAccessible(true);
 privateField.set(someObject, "Alexei");
 
    
}System.out.println(someObject.getSomePrivate());
}
}