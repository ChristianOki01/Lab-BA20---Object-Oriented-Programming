/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.christiano.es;
import java.util.Scanner;

/**
 *
 * @author Christiano E S
 */
public class Week5ChristianoES 
{

    /**
     * @param args the command line arguments
     */
    public static void clrscr()
    {
        for (int i = 0; i < 50; ++i) 
            System.out.println();
    }
    
    public static void binary(int decimal)
    {
        int[] remainder = new int[8];
        int index = 0, temp = decimal;
        do
        {
            remainder[index++] = temp % 2;
            temp = temp / 2;
        }
        while(temp != 0);
        StringBuilder binary = new StringBuilder();
        for(int i = index-1; i >= 0; i--) 
        {
            binary.append(String.valueOf(remainder[i]));
        }
        System.out.print("\n\nThe result of Binary decimal " + decimal + " : " + binary);
    }
    
    public static void binarystep(int decimal)
    {
        int[] remainder = new int[8];
        int[] quotient = new int[8];
        int[] temp = new int[8];
        temp[0] = decimal;
        int index = 0;
        do
        {
            remainder[index] = temp[index] % 2;
            temp[index + 1] = temp[index] / 2;
            quotient[index] = temp[index + 1];
            index++;
        }
        while(temp[index] != 0);
        StringBuilder binary = new StringBuilder(); 
        for(int i = index-1; i >= 0; i--) 
        {
            binary.append(String.valueOf(remainder[i]));
        }
        System.out.println("\n\nThe Result of Binary decimal");
        for(int i = 0; i < index; i++) 
        {
            System.out.println("Step " + (i + 1) + ": " + temp[i] + "/2, Remainder = " + remainder[i] + ", Quotient = " + quotient[i]);
        }
        System.out.println("\n" + decimal + " in decimal = " + binary + " in binary");
    }
    
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int choice, decimal;
        do
        {
            clrscr();
            System.out.println("Menu : ");
            System.out.println("=======");
            System.out.println("1. Binary number");
            System.out.println("2. Binary number with step");
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
                    do
                    {
                        System.out.print("Input the number [1-100]: ");
                        decimal= christiano.nextInt();
                        christiano.nextLine();
                    }
                    while(decimal<1 || decimal>100);
                    binary(decimal);
                    christiano.nextLine();
                    break;
                }
                
                case 2:
                {
                    do
                    {
                        System.out.print("Input the number [1-100]: ");
                        decimal= christiano.nextInt();
                        christiano.nextLine();
                    }
                    while(decimal<1 || decimal>100);
                    binarystep(decimal);
                    christiano.nextLine();
                    break;
                }
            }
        }
        while(choice!=3);
        System.out.println("Thank you and have a nice day.. ^^");
    }
}
