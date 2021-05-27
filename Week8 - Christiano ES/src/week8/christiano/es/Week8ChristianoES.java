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
public class Week8ChristianoES {

    /**
     * @param args the command line arguments
     */
    public static Scanner christiano = new Scanner(System.in);
    
    public static void clrscr()
    {
        for (int i = 0; i < 30; ++i) 
            System.out.println();
    }
    
    public static void AddEmployee(ArrayList<Employee> data)
    {
        String name, role, type; 
        int age, pay, work, base;
        do
        {
            System.out.print("Input employee name[must be more than 3 characters]: ");
            name = christiano.nextLine();
        }
        while(name.length() <= 3);
        do
        {
            System.out.print("Input employee age[>= 17]: ");
            age = christiano.nextInt();
            christiano.nextLine();
        }
        while(age<17);
        do
        {
            System.out.print("Input employee role[Assistant | Programmer](Case Sensitive) : ");
            role = christiano.nextLine();
        }
        while(role.compareTo("Assistant")!=0 && role.compareTo("Programmer")!=0);
        
        do
        {
            System.out.print("Input employee type[PartTime | FullTime](Case Sensitive): ");
            type = christiano.nextLine();
        }
        while(type.compareTo("PartTime")!=0 && type.compareTo("FullTime")!=0);
        
        if(type.compareTo("PartTime")==0)
        {
            do
            {
                System.out.print("Input pay per hour[>=10000]: ");
                pay = christiano.nextInt();
            }
            while(pay<10000);
            
            do
            {
                System.out.print("Input working hour per week[>0]: ");
                work = christiano.nextInt();
            }
            while(work<0);
            PartTime pt = new PartTime(name, role, type, age, pay, work);
            data.add(pt);
        }
        else
        {
            do
            {
                System.out.print("Input base salary[>10000]: ");
                base = christiano.nextInt();
            }
            while(base<10000);
            FullTime ft = new FullTime(name, role, type, age, base);
            data.add(ft);
        }
        System.out.println("Success insert employee data");
        System.out.println("Press any key to continue...");
        christiano.nextLine();
    }
    
    public static void ViewEmployee(ArrayList<Employee> data)
    {
        if(data.isEmpty())
            System.out.print("There is no employee data in the list");
        else
        {
            for(int i=0; i<data.size(); i++)
            {
               System.out.println("\nEmployee no. " + (i+1));
               data.get(i).view();
            }
        }   
    }
    
    public static void Resign(ArrayList<Employee> data)
    {
        int nomor;
        if(data.isEmpty())
            System.out.print("There is no employee data in the list");
        else
        {
            for(int i=0; i<data.size(); i++)
            {
               System.out.println("\nEmployee no. " + (i+1));
               data.get(i).view();
            }
            do
            {
                System.out.print("Input employee number that want to resign[1..." + data.size() +"] : ");
                nomor = christiano.nextInt();
            }
            while(nomor<=0 || nomor>data.size());
            if(data.get(nomor-1).active==true)
            {
                data.get(nomor-1).resign();
                System.out.println(data.get(nomor-1).getEmployeeName() + " is resigning...");
            }
            else
                System.out.println("Employee has already resigned!");
        }
    }
    
    
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int choice;
        ArrayList<Employee> data = new ArrayList<>();
        do
        {
            System.out.println("ABC EMPLOYEE DATA");
            System.out.println("=================");
            System.out.println("1. Add employee");
            System.out.println("2. View employee");
            System.out.println("3. Resign");
            System.out.println("4. Exit");
            System.out.print("Choice : ");
            choice = christiano.nextInt();
            christiano.nextLine();
            clrscr();
            
            switch(choice)
            {
                case 1:
                {
                    clrscr();
                    AddEmployee(data);
                    christiano.nextLine();
                    break;
                }
                
                case 2:
                {
                    clrscr();
                    ViewEmployee(data);
                    christiano.nextLine();
                    break;
                }
                
                case 3:
                {
                    clrscr();
                    Resign(data);
                    christiano.nextLine();
                    break;
                }
            }
        }
        while(choice!=4);
    }

}
