/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10.christiano.es;
import java.util.*;
/**
 *
 * @author Christiano E S
 */
public class Week10ChristianoES 
{

    public static Scanner christiano = new Scanner(System.in);
    
    public static ArrayList<Animal> data = new ArrayList<>();
    
    public static int hareWin = 0, turtleWin = 0;
    
    public static void clrscr()
    {
        for (int i = 0; i < 30; ++i) 
            System.out.println();
    }
    
    public static void AddRunner(ArrayList<Animal> data)
    {
        String type, name;
        int speed;
        Random rand = new Random();
        do
        {
            System.out.print("Which animal you will rooting for [hare | turtle]? ");
            type = christiano.nextLine();
        }
        while(type.compareTo("hare")!=0 && type.compareTo("turtle")!=0);

        do
        {
            System.out.print("What's the name [5 - 15 characters]? ");
            name = christiano.nextLine();
        }
        while(name.length() < 5 || name.length() > 15);
                
        if(type.compareTo("hare")==0)
        {
            int number = rand.nextInt(51);
            speed = number + 25;
            Hare hr = new Hare(type, name, speed);
            data.add(hr);

        }
        else
        {
            int number = rand.nextInt(26);
            speed = number + 25;
            Turtle tr = new Turtle(type, name, speed);
            data.add(tr);
        }
        System.out.println("Another runner has joined the race!!");
        christiano.nextLine();
    }
    
    public static void JoinRun(ArrayList<Animal> data)
    {
       int totalDistance;
       Random rand = new Random();
       if(data.isEmpty())
        {
            System.out.println("+=================================+");
            System.out.println("+ No Runner has been inputted     +");  
            System.out.println("+=================================+");
        } 
       else if(data.size()==1)
       {
           System.out.println("+=================================+");
           System.out.println("+ There are only 1 Runner         +");  
           System.out.println("+=================================+");
       }
       else
       {
           System.out.println("Generating data statistics.");
           christiano.nextLine();
           System.out.println("Generating data statistics..");
           christiano.nextLine();
           System.out.println("Generating data statistics...");
           christiano.nextLine();
           
           totalDistance = rand.nextInt(3);
           if(totalDistance == 0)
           {
               totalDistance = 150;
           }
           else if(totalDistance == 1)
           {
               totalDistance = 250;
           }
           else
           {
               totalDistance = 500;
           }
           do
           {
                System.out.printf("\n+===========================================+\n");
                System.out.printf("+ Current Standing                     " + totalDistance + "  +\n");
                System.out.printf("+===========================================+\n");
                System.out.printf("+ No.  | Name           | Type   | Distance +\n");
                for(int i=0;i<data.size();i++)
                {
                    data.get(i).move();
                    data.get(i).setDistance();
                    Collections.sort(data,Collections.reverseOrder());
                }
                for(int i=0;i<data.size();i++)
                {
                    System.out.printf("+ %2d   | %-15s| %-6s | %-8s +\n", i+1, data.get(i).getName(), data.get(i).getType(), data.get(i).getDistance());
                }
                System.out.printf("+===========================================+\n");
                christiano.nextLine();
            }
           while(data.get(0).getDistance()<totalDistance);
            
            if(data.get(0).getType().compareTo("hare")==0)
            {
                hareWin++;
            }
            else
            {
                turtleWin++;
            }
            
            for(int i=0;i<data.size();i++)
            {
               data.get(i).resetDistance();
            }
       }
    }
    
    
    public static void ViewStanding(ArrayList<Animal> data)
    {
        if(data.isEmpty())
        {
            System.out.println("+=================================+");
            System.out.println("+ No Score has been inputted      +");  
            System.out.println("+=================================+");
        }
        else
        {
            if(hareWin == turtleWin)
            {
                System.out.println(" ______   ______    _______  _     _");
                System.out.println("|      | |    _ |  |   _   || | _ | |");
                System.out.println("|  _    ||   | ||  |  |_|  || || || |");
                System.out.println("| | |   ||   |_||_ |       ||       |");
                System.out.println("| |_|   ||    ___ ||       ||       |");
                System.out.println("|       ||   |  | ||   _   ||   _   |");
                System.out.println("|______| |___|  |_||__| |__||__| |__|");
            }
            else if(hareWin > turtleWin)
            {
                System.out.println(" __   __  _______  ______    _______    ___      _______  _______  ______   _______ ");
                System.out.println("|  | |  ||   _   ||    _ |  |       |  |   |    |       ||   _   ||      | |       |");
                System.out.println("|  |_|  ||  |_|  ||   | ||  |    ___|  |   |    |    ___||  |_|  ||  _    ||  _____|");
                System.out.println("|       ||       ||   |_||_ |   |___   |   |    |   |___ |       || | |   || |_____ ");
                System.out.println("|       ||       ||    __  ||    ___|  |   |___ |    ___||       || |_|   ||_____  |");
                System.out.println("|   _   ||   _   ||   |  | ||   |___   |       ||   |___ |   _   ||       | _____| |");
                System.out.println("|__| |__||__| |__||___|  |_||_______|  |_______||_______||__| |__||______| |_______|");
            }
            else
            {
                System.out.println(" _______  __   __  ______    _______  ___      _______    ___      _______  _______  ______   _______ ");
                System.out.println("|       ||  | |  ||    _ |  |       ||   |    |       |  |   |    |       ||   _   ||      | |       |");
                System.out.println("|_     _||  | |  ||   | ||  |_     _||   |    |    ___|  |   |    |    ___||  |_|  ||  _    ||  _____|");
                System.out.println("  |   |  |  |_|  ||   |_||_   |   |  |   |    |   |___   |   |    |   |___ |       || | |   || |_____ ");
                System.out.println("  |   |  |       ||    ___ |  |   |  |   |___ |    ___|  |   |___ |    ___||       || |_|   ||_____  |");
                System.out.println("  |   |  |       ||   |  | |  |   |  |       ||   |___   |       ||   |___ |   _   ||       | _____| |");
                System.out.println("  |___|  |_______||___|  |_|  |___|  |_______||_______|  |_______||_______||__| |__||______| |_______|");
            }
            System.out.printf("+=================================+\n");
            System.out.printf("+      Hare      +     Turtle     +\n");
            System.out.printf("+=================================+\n");
            System.out.printf("+ %-14d + %-14d +\n", hareWin, turtleWin);
            System.out.printf("+=================================+\n");
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int choice;
        System.out.println(" _______      ___            ______    __   __   __    _");
        System.out.println("|  _    |    |   |          |    _ |  |  | |  | |  |  | |");
        System.out.println("| |_|   |    |   |   ____   |   | ||  |  | |  | |   |_| |");
        System.out.println("|       |    |   |  |____|  |   |_||_ |  |_|  | |       |");
        System.out.println("|  _   |  ___|   |          |    ___ ||       | |  _    |");
        System.out.println("| |_|   ||       |          |   |  | ||       | | | |   |");
        System.out.println("|_______||_______|          |___|  |_||_______| |_|  |__|\n");
        do
        {
            System.out.println("+===================+");
            System.out.println("+ Menu List~        +");
            System.out.println("+===================+");
            System.out.println("+ 1. Add Runner     +");
            System.out.println("+ 2. Join Run       +");
            System.out.println("+ 3. View Standing  +");
            System.out.println("+ 4. Close Program  +");
            System.out.println("+===================+");
            System.out.print("Choice >> ");
            choice = christiano.nextInt();
            christiano.nextLine();
            clrscr();
            
            switch(choice)
            {
                case 1:
                {
                    clrscr();
                    AddRunner(data);
                    christiano.nextLine();
                    break;
                }
                
                case 2:
                {
                    clrscr();
                    JoinRun(data);
                    christiano.nextLine();
                    break;
                }
                
                case 3:
                {
                    clrscr();
                    ViewStanding(data);
                    christiano.nextLine();
                    break;
                }
            }
        }
        while(choice!=4);
    }    
}
