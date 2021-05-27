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
public class PartTime extends Employee
{
    private int pay;
    private int work;
    
    
    public PartTime(String name, String role, String type, int age, int pay, int work)
    {
        super(name, role, type, age);
        this.pay = pay;
        this.work = work;
        this.active = true;
    }
    
    @Override public void view()
    {
        int total = pay * work * 4;
        System.out.println("Part Time Employee");
        System.out.println("==================");
        if(active)
            System.out.println("Status : active");
        else
            System.out.println("Status : not active");
        super.view();
        System.out.println("Pay per hour: " + pay);
        System.out.println("Working hour per week: " + work);
        System.out.println("Salary per month: " + total);
    }
}
