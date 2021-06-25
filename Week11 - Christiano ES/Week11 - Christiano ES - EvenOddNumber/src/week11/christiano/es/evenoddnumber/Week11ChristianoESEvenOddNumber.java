/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11.christiano.es.evenoddnumber;
import java.util.*;
/**
 *
 * @author Christiano E S
 */
public class Week11ChristianoESEvenOddNumber 
{
    public static Scanner christiano = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    
     public static class EvenNumber extends Thread 
     {
        int even, angka;
        
        EvenNumber(int even, int angka) 
        {
            this.even = even;
            this.angka = angka;
        }
        
        @Override
        public void run() 
        {
            for(int i=0; i<even; i++)
            {
                System.out.println("Even number: " + angka);
                angka+=2;
                
                try
                {
                    Thread.sleep(1000);
                }
                
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }    
    
    public static class OddNumber extends Thread 
    {
        int odd, angka1;
        
        OddNumber(int odd, int angka1) 
        {
            this.odd = odd;
            this.angka1 = angka1;
        }
        
        @Override
        public void run() 
        {
            for(int i=0; i<odd; i++)
            {
                System.out.println("Odd number: " + angka1);
                angka1+=2;
                
                try
                {
                    Thread.sleep(2000);
                }
                
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }        
    }
    
    
    
    public static void main(String[] args) throws InterruptedException
    {
        int even, odd, angka = 0, angka1 = 1;
        // TODO code application logic here
        System.out.println("+=====================+");
        System.out.println("+ Even and Odd Number +");
        System.out.println("+=====================+");
        do
        {
            System.out.println("How many numbers of even number you want to display?[>0]: ");
            even = christiano.nextInt();
        }
        while(even<=0);
        do
        {
            System.out.println("How many numbers of odd number you want to display?[>0]: ");
            odd = christiano.nextInt();
        }
        while(even<=0);
        
        EvenNumber genap = new EvenNumber(even, angka);
        OddNumber ganjil = new OddNumber(odd, angka1);
        
        
        genap.start();
        Thread.sleep(100);
        ganjil.start();
        
        try
        {
            genap.join();
            ganjil.join();
        }
        
        catch(InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
    
}
