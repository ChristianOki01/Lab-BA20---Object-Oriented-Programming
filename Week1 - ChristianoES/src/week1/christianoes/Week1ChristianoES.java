/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1.christianoes;
import java.util.Scanner;
/**
 *
 * @author Christiano E S
 */
public class Week1ChristianoES 
{

    /**
     * @param args the command line arguments
     */

    
    
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int choose, order, money, change, i = 0, j = 0, z;    
        do
        {
            System.out.println("Welcome to Yummy Delivery Pizza");
            System.out.println("===============================");
            System.out.println("1. Order Pizza");
            System.out.println("2. Pay");
            System.out.println("3. Exit");
            System.out.println("Choose : ");
            Scanner christiano = new Scanner(System.in);
            choose = christiano.nextInt();

            switch(choose)
            {
                case 1:
                {
                int more;
                System.out.println("Choose an order");
                System.out.println("===============");
                System.out.println("1. Meat Lover Pizza <@ Rp. 80000,->");
                System.out.println("2. Vegetarian Pizza <@ Rp. 50000,->");
                do
                {    
                    do
                    {
                        System.out.println("Which pizza do you want to order[1-2]: ");
                        order = christiano.nextInt();
                    }
                    while(order!=1 && order!=2);

                    if(order==1)
                        i++;
                    else if(order==2)
                        j++;
                    System.out.println("Do you want to order more ? 1: OK, 0: NO : ");
                    more = christiano.nextInt();
                }
                while(more==1);
                break;
                }

                case 2:
                {
                if(i==0 && j==0)
                    System.out.println("You are not buy anything");
                else
                    System.out.println("You have ordered " + i + " Meat Lover Pizza<s> and " + j + " Vegetarian Pizza<s>.");
                    z =(( i * 80000 ) + ( j * 50000 )); 
                    System.out.println("Total Price : " + z);
                    do
                    {
                        System.out.println("Input your money [minimum Rp. " + z + "]: Rp. ");
                        money = christiano.nextInt();
                    }
                    while(money<z);
                    change = money - z;
                    System.out.println("Your change : " + change);
                    System.out.println("Thank you...");
                    i = 0;
                    j = 0;
                break;
                }
            }
        }
        while(choose!=3);            
    }    
}
