/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8.christiano.es;
import java.util.*;
/**
 *
 * @author Christiano E S
 */
public class Employee 
{
    protected String name; 
    protected String role; 
    protected String type; 
    protected int age; 
    protected boolean active;
    
    Employee(String name, String role, String type, int age)
    {
        this.name = name;
        this.role = role;
        this.type = type;
        this.age = age;
        this.active = true;
    }
    
    void setEmployee(String name, String role, String type, int age)
    {
        this.name = name;
        this.role = role;
        this.type = type;
        this.age = age;
    }
    
    String getEmployeeName()
    {
        return name; 
    }
    
    String getEmployeeRole(){
        return role; 
    }
    
    String getEmployeeType(){
        return type; 
    }
    
    int getEmployeeAge()
    {
        return age; 
    }

    public void resign()
    {
        active = false;
    }

    
    public void view()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
    }
}

    


