/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9.christiano.es;
import java.util.*;
/**
 *
 * @author Christiano E S
 */
public class Feline extends Animal
{
    private int max = 0;
    private int now = 0;
    private int speed = 30;
    
    public Feline(String name, String gender, String genus)
    {
        super(name, gender, genus);
    }
    
    @Override public void roam()
    {
        int ttl_range,duration;
        Random rand = new Random();
        int nomor = rand.nextInt(2);
        if(nomor==0)
        {
            System.out.println("Feline doesn't feel like roaming at all today..");
        }
        else
        {
            if(super.getRoamingTime()==0)
            {
                duration = 30;
            }
            else
            {
                duration = super.getRoamingTime()/2;
            }
            int lama = rand.nextInt(duration);
            ttl_range = lama * speed;
            System.out.println("roaming for total range of " + ttl_range + " in " + duration + " minutes");
        }
    }
    
    @Override public void makeSound1()
    {
        System.out.println("meow meow <3");
    }
    
    @Override public void makeSound2()
    {
        System.out.println("hiss!!");
    }
    
}
