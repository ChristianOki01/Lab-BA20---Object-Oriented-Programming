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
public class FullTime extends Employee 
{
    private int base;
    
    
    public FullTime(String name, String role, String type, int age, int base)
    {
        super(name, role, type, age);
        this.base = base;
        this.active = true;
    }
    
    @Override public void view()
    {
        System.out.println("Full Time Employee");
        System.out.println("==================");
        if(active)
            System.out.println("Status : active");
        else
            System.out.println("Status : not active");
        super.view();
        System.out.println("Base salary per month: " + base);
    }
}
