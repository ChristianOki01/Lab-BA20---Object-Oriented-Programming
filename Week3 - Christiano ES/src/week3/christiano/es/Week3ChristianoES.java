/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3.christiano.es;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Christiano E S
 */
public class Week3ChristianoES 
{
    public static void clrscr()
    {
        for (int i = 0; i < 50; ++i) 
            System.out.println();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int choice, gas = 100;
        do
        {
            clrscr();
            System.out.println("Your gasoline's car: "+  gas +" liters");
            System.out.println("=======================");
            System.out.println("1. Start driving");
            System.out.println("2. Rest");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            Scanner christiano = new Scanner(System.in);
            choice = christiano.nextInt();
            christiano.nextLine();
            clrscr();
            
            switch(choice)
            {
                case 1:
                {
                    int newnumber;
                    Random number = new Random();
                    newnumber = number.nextInt(100) + 1;
                    if(newnumber >= 50 && gas >= 40)
                    {
                        System.out.println("Your speed : " + newnumber + "km/hour");
                        gas = gas - 40;
                        System.out.println("You have spent 40 liters gasoline");
                    }
                    else if (newnumber < 50 && gas >= 20)
                    {
                            System.out.println("Your speed : " + newnumber + "km/hour");
                            gas = gas - 20;
                            System.out.println("You have spent 20 liters gasoline");
                    }
                    else
                    {
                        System.out.println("Your gasoline is not enough to run the car...");
                    }
                    System.out.print("\nPress enter to return to main menu..");
                    christiano.nextLine();
                    break;
                }
                
                case 2:
                {
                    if(gas == 100)
                    {
                        System.out.println("Your gasoline is full");
                        christiano.nextLine();
                    }
                    else
                    {
                        gas = gas + 20;
                        System.out.println("Succesfully recharge 20 liters gasoline...");
                        System.out.print("\nPress enter to return to main menu..");
                        christiano.nextLine();
                    }
                    break;
                }
            }
        }
        while(choice!=3);
    }
}
