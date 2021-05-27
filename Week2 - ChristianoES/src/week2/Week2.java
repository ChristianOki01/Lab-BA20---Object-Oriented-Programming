/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;
import java.util.Scanner;

/**
 *
 * @author Christiano E S
 */
public class Week2 
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
        int choice;
        do
        {   
            clrscr();
            System.out.println("SUBJECT");
            System.out.println("=======");
            System.out.println("1. Mathematics");
            System.out.println("2. English");
            System.out.println("3. Exit");
            System.out.print("Choice : ");
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
                        System.out.println("MATH MENU");
                        System.out.println("=========");
                        System.out.println("1. Calculate circle area");
                        System.out.println("2. Calculate rectangle area");
                        System.out.print("Choice : ");
                        choice = christiano.nextInt();
                        christiano.nextLine();

                        switch(choice)
                        {    
                            case 1:
                            {
                                int number;
                                double area;
                                String input;
                                do
                                {
                                    System.out.print("Choose input type[Radius | Diameter](Case Insensitive): ");
                                    input = christiano.next();
                                }
                                while(input.compareTo("Radius")!=0 && input.compareTo("radius")!=0 && 
                                      input.compareTo("Diameter")!=0 && input.compareTo("diameter")!=0);
                                System.out.print("Input number : ");
                                number = christiano.nextInt();
                                christiano.nextLine();

                                if(input.compareTo("Radius")==0 || input.compareTo("radius")==0)
                                {
                                    area = Math.PI * Math.pow(number, 2);
                                    System.out.println("===============================");
                                    System.out.println("The generated radius value is " + number);
                                    System.out.println("The area of the circle is " + area);
                                    System.out.print("\nPress any key to continue...");
                                    christiano.nextLine();
                                }
                                else
                                {
                                    area = Math.PI * Math.pow(number/2, 2);
                                    System.out.println("The generated radius value is " + number/2);
                                    System.out.println("The area of the circle is " + area);
                                    System.out.print("\nPress any key to continue...");
                                    christiano.nextLine();
                                }
                                break;
                            }
                            

                            case 2:
                            {
                                double width, length, area1;
                                System.out.print("Input width : ");
                                width = christiano.nextDouble();
                                christiano.nextLine();
                                System.out.print("Input lenght : ");
                                length = christiano.nextDouble();
                                christiano.nextLine();
                                area1 = width * length;
                                System.out.println("The area of the rectangle is " + area1);
                                System.out.print("\nPress any key to continue...");
                                christiano.nextLine();
                                break;
                            }
                        }
                    }
                    while(choice!=1&&choice!=2);
                    break;
                }

                case 2:
                {
                    clrscr();
                    String word, tenses;
                    do
                    {
                        System.out.print("Input word[only 1 word | must only be alphabet]: ");
                        word = christiano.nextLine();
                    }
                    while(word.compareTo("")==0 || !word.matches("^[a-zA-Z]*$") || word.contains(" "));
                    do
                    {
                        System.out.print("\nInput tenses type[Present | Past](Case Sensitive): ");
                        tenses = christiano.nextLine();
                    }
                    while(tenses.compareTo("Past")!=0 && tenses.compareTo("Present")!=0);
                    
                    if(tenses.compareTo("Present")==0)
                    {
                        if(word.split("")[word.length()-1].equals("s") || (word.split("")[word.length()-2].equals("e") && word.split("")[word.length()-1].equals("s"))) System.out.println(word + " is a plural word");
                        else System.out.println(word + " is a singular word");
                    }
                    else
                    {
                        if(word.split("")[word.length()-1].equals("d") || (word.split("")[word.length()-2].equals("e") && word.split("")[word.length()-1].equals("d"))) System.out.println(word + " is regular verb");
                        else System.out.println(word + " is irregular verb");
                    }
                    System.out.println("It contains of " + word.length() + " character(s)");
                    System.out.print("\nPress any key to continue...");
                    christiano.nextLine();
                }
            }
        }
        while(choice!=3);            
    }    
}
