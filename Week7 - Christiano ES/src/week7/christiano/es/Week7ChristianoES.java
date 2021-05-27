/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.christiano.es;
import java.util.*;

/**
 *
 * @author Christiano E S
 */
public class Week7ChristianoES 
{

    
    /**
     * @param args the command line arguments
     */
    
    public static Scanner christiano = new Scanner(System.in);
    
    public static void clrscr()
    {
        for (int i = 0; i < 50; ++i) 
            System.out.println();
    }
    
    public static void main(String[] args) 
    {
        // TODO code application logic here
        ArrayList<Cake> cakes = new ArrayList<>();
        int choice, flour;
        String flavor, topping;
        do
        {
            System.out.println("HOMEMADE CAKE");
            System.out.println("=============");
            System.out.println("1. Add cake to be bake");
            System.out.println("2. Bake cake");
            System.out.println("3. Change cake topping");
            System.out.println("4. View cake list");
            System.out.println("5. Exit");
            System.out.print("Choice : ");
            choice = christiano.nextInt();
            christiano.nextLine();
            clrscr();
            
            switch(choice)
            {
                case 1:
                {
                    clrscr();
                    do
                    {
                        System.out.print("Choose cake flavor[Cheese | Chocolate | Vanilla](Case Sensitive): ");
                        flavor = christiano.nextLine();
                    }
                    while(flavor.compareTo("Cheese")!=0 && flavor.compareTo("Chocolate")!=0 && flavor.compareTo("Vanilla")!=0);
                    
                    do
                    {
                        System.out.print("Input how many flour will be used (gram)[>0]: ");
                        flour = christiano.nextInt();
                        christiano.nextLine();
                    }
                    while(flour<=0);
                    
                    do
                    {
                        System.out.print("Input your cake topping[Cream | Oreo](Case Sensitive): ");
                        topping = christiano.nextLine();
                    }
                    while(topping.compareTo("Cream")!=0 && topping.compareTo("Oreo")!=0);
                    Cake cake = new Cake(flavor,flour, topping);
                    cakes.add(cake);
                    System.out.println("The cake is made!");
                    christiano.nextLine();
                    break;
                }
                
                case 2:
                {
                    clrscr();
                    int number;
                    if (cakes.size() == 0)
                    {
                        System.out.println("There is no cake that has been made yet!");
                    }
                    else
                    {
                        System.out.println("\n" + cakes.size() + " cake(s) are in the list");

                        for(int i=0; i<cakes.size(); ++i) 
                        {
                            System.out.println("Cake number " + (i + 1));
                            System.out.println("==============");
                            System.out.println("Cake flavor: " + cakes.get(i).flavor);
                            System.out.println("Cake flour: " + cakes.get(i).flour);
                            System.out.println("Cake sugar: " + cakes.get(i).sugar);
                            System.out.println("Cake topping: " + cakes.get(i).topping);
                            System.out.println(cakes.get(i).status == 1 ? "The cake has been baked" : "The cake has not been baked");
                        }
                        do
                        {
                            System.out.print("Input cake number[1.." + cakes.size() + "]: ");
                            number = christiano.nextInt();
                        }
                        while(number>cakes.size());
                        christiano.nextLine();

                        flavor = cakes.get(number-1).flavor;
                        flour = cakes.get(number-1).flour;
                        int sugar = cakes.get(number-1).sugar;
                        System.out.println("Mixing " + flavor + "flavor, " + flour + " gram of flour, " + sugar + " gram of sugar");
                        System.out.println("Baking the cake...");
                        cakes.get(number-1).bake();
                    }
                    christiano.nextLine();
                    break;
                }
                
                case 3:
                {
                    clrscr();
                    int number1;
                    if (cakes.size() == 0)
                    {
                        System.out.println("There is no cake that has been made yet!");
                    }
                    else
                    {
                        for(int i=0; i<cakes.size(); ++i) 
                        {
                            System.out.println("Cake number " + (i + 1));
                            System.out.println("==============");
                            System.out.println("Cake flavor: " + cakes.get(i).flavor);
                            System.out.println("Cake flour: " + cakes.get(i).flour);
                            System.out.println("Cake sugar: " + cakes.get(i).sugar);
                            System.out.println("Cake topping: " + cakes.get(i).topping);
                            System.out.println(cakes.get(i).status == 1 ? "The cake has been baked" : "The cake has not been baked");
                        }
                        do
                        {
                            System.out.print("Input cake number[1.." + cakes.size() + "]: ");
                            number1 = christiano.nextInt();
                        }
                        while(number1>cakes.size());
                        christiano.nextLine();
                        
                        do
                        {
                           System.out.print("Input your new cake topping[Cream | Oreo]: ");
                           topping = christiano.nextLine();
                        }
                        while(topping.compareTo("Cream")!=0 && topping.compareTo("Oreo")!=0);
                        
                        cakes.get(number1-1).setTopping(topping);
                        System.out.println("The topping is changed!\n");
                    }
                    christiano.nextLine();
                    break;
                }
                
                case 4:
                {
                    clrscr();
                    if (cakes.size() == 0)
                    {
                        System.out.println("There is no cake that has been made yet!");
                    }
                    else
                    {
                        for(int i=0; i<cakes.size(); ++i) 
                        {
                            System.out.println("Cake number " + (i + 1));
                            System.out.println("==============");
                            System.out.println("Cake flavor: " + cakes.get(i).flavor);
                            System.out.println("Cake flour: " + cakes.get(i).flour);
                            System.out.println("Cake sugar: " + cakes.get(i).sugar);
                            System.out.println("Cake topping: " + cakes.get(i).topping);
                            System.out.println(cakes.get(i).status == 1 ? "The cake has been baked" : "The cake has not been baked");
                        }
                    }
                    christiano.nextLine();
                    break;
                }
            }
        }
        while(choice!=5);
    }
}
