/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11.christiano.es.mathematics;
import java.util.*;
/**
 *
 * @author Christiano E S
 */
public class Week11ChristianoESMathematics 
{

    public static Scanner christiano = new Scanner(System.in);
    
    public static void clrscr()
    {
        for (int i = 0; i < 30; ++i) 
            System.out.println();
    }
    
    public static <E> void printElements(E[] input) 
    {
        for(E elements : input)
        {
            System.out.print(elements + " ");
        }
        System.out.println();
    }
    
    
    public static void printNumbers()
    {
        int first, second, third;
        do
        {
            System.out.print("Input first number[>0]: ");
            first = christiano.nextInt();
        }
        while(first<=0);
        do
        {
            System.out.print("Input second number[>0]: ");
            second = christiano.nextInt();
        }
        while(second<=0);
        do
        {
            System.out.print("Input third number[>0]: ");
            third = christiano.nextInt();
        }
        while(third<=0);

        Integer[] number = {first, second, third};
        System.out.printf("Numbers inputted: ");
        printElements(number);
    }
    
    public static void printWords() {
        String first, second, third;
        do
        {
            System.out.print("Input the first word[must be more than 1 character]: ");
            first = christiano.nextLine();
        }
        while(first.length()<=1);
        
        do
        {
            System.out.print("Input the second word[must be more than 1 character]: ");
            second = christiano.nextLine();
        }
        while(second.length()<=1);

        do
        {
            System.out.print("Input the third word[must be more than 1 character]: ");
            third = christiano.nextLine();
        }
        while(third.length()<=1);       
        
        String[] words = {first, second, third};
        System.out.print("Words inputted: ");
        printElements(words);
    }
    
    public static class Cuboid<T>
    {
        
        private T width;
        private T length;
        private T height;
        
        public Cuboid(T width, T length, T height)
        {
            this.width = width;
            this.length = length;
            this.height = height;
        }
        
        public T getWidth()
        {
            return width;
        }
        
        public T getLength()
        {
            return length;
        }
        
        public T getHeight()
        {
            return height;
        }
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
            System.out.println("+===================+");
            System.out.println("+ Mathematics       +");
            System.out.println("+===================+");
            System.out.println("1. Print elements");
            System.out.println("2. Calculate cuboid volume");
            System.out.println("3. Simple Calculator");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
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
                        System.out.println("+===================+");
                        System.out.println("+ PRINT MENU        +");
                        System.out.println("+===================+");
                        System.out.println("1. Print numbers");
                        System.out.println("2. Print words");
                        System.out.print("Choice: ");
                        choice = christiano.nextInt();
                        christiano.nextLine();
                        switch(choice)
                        {
                            case 1:
                            {
                                printNumbers();
                                christiano.nextLine();
                                break;
                            }
                            case 2:
                            {
                                printWords();
                                christiano.nextLine();
                                break;
                            }
                        }
                    }
                    while(choice<1 && choice>2);
                    break;
                }
                
                case 2:
                {
                    clrscr();
                    String type;
                    System.out.println("+=======================+");
                    System.out.println("+Calculate cuboid volume+");
                    System.out.println("+=======================+");
                    do
                    {
                        System.out.print("Input value type you want to use[Double | Integer](Case Insensitive): ");
                        type = christiano.nextLine();
                    }
                    while(type.compareTo("Double")!=0 && type.compareTo("double")!=0 && type.compareTo("Integer")!=0 && type.compareTo("integer")!=0);
                    if(type.compareTo("Double")==0 || type.compareTo("double")==0)
                    {
                        double width,length,height;
                        do
                        {
                            System.out.print("Input width[>0]: ");
                            width = christiano.nextDouble();
                        }
                        while(width<=0);
                        
                        do
                        {
                            System.out.print("Input length[>0]: ");
                            length = christiano.nextDouble();
                        }
                        while(length<=0);
                        
                        do
                        {
                            System.out.print("Input height[>0]: ");
                            height = christiano.nextDouble();
                        }
                        while(height<=0);
                        
                        Cuboid<Double> DoubleType = new Cuboid<>(width,length,height);
                        System.out.println("The volume of the cuboid with:");
                        System.out.println("Width: " + DoubleType.getWidth());
                        System.out.println("Length: " + DoubleType.getLength());
                        System.out.println("Height: " + DoubleType.getHeight());
                        System.out.println("Volume : "+ DoubleType.getWidth()*DoubleType.getLength()*DoubleType.getHeight());
                    }
                    else
                    {
                        int width,length,height;
                        do
                        {
                            System.out.print("Input width[>0]: ");
                            width = christiano.nextInt();
                        }
                        while(width<=0);
                        
                        do
                        {
                            System.out.print("Input length[>0]: ");
                            length = christiano.nextInt();
                        }
                        while(length<=0);
                        
                        do
                        {
                            System.out.print("Input height[>0]: ");
                            height = christiano.nextInt();
                        }
                        while(height<=0);
                        
                        Cuboid<Integer> IntegerType = new Cuboid<>(width,length,height);
                        System.out.println("The volume of the cuboid with:");
                        System.out.println("Width: " + IntegerType.getWidth());
                        System.out.println("Length: " + IntegerType.getLength());
                        System.out.println("Height: " + IntegerType.getHeight());
                        System.out.println("Volume : "+ IntegerType.getWidth()*IntegerType.getLength()*IntegerType.getHeight());
                    }
                    christiano.nextLine();
                    break;
                }
                
                case 3:
                {
                    clrscr();
                    int first, second;
                    System.out.println("+=======================+");
                    System.out.println("+CALCULATOR             +");
                    System.out.println("+=======================+");
                    do
                    {
                        System.out.print("Input first number[>0]: ");
                        first = christiano.nextInt();
                    }
                    while(first<=0);
                    do
                    {
                        System.out.print("Input second number[>0]: ");
                        second = christiano.nextInt();
                    }
                    while(second<=0);
                    
                    SimpleCalculator cct = new SimpleCalculator(first,second);
                    System.out.println("Add result: " + cct.Add());
                    System.out.println("Substract result: " + cct.Subs());
                    System.out.println("Multiple result: " + cct.Multi());
                    System.out.println("Divide result: " + cct.Div());
                    christiano.nextLine();
                    break;
                }
            }
        }
        while(choice!=4);
    }
    
}
