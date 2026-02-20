/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.polban.employee.model;

/**
 *
 * @author ASUS
 */
public class Department {
    private String name;
    
    // constructor
    public Department(String name){
        this.name = name;
    }
    
    // getter
    public String getName(){
        return name;
    }
    
    // setter
    public void setName(String name){
        this.name = name;
    }
}
