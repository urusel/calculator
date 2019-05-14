/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classes;

/**
 *
 * @author user
 */
public class Human {
    public int age;
    public String name;
    
    public Human(int age, String name){
        this.age=age;
        this.name=name;
    }
    @Override
    public String toString(){
        return this.age + "" + this.name;
    }
}
