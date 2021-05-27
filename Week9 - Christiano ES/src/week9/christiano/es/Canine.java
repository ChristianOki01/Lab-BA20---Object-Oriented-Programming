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
public class Canine extends Animal
{
    
    private int speed;
    private int max = 0;
    private int now = 0;
    
    public Canine(String name, String gender, String genus, int speed)
    {
        super(name, gender, genus);
        this.speed = speed;
    }
    
    @Override public void roam()
    {
        int ttl_range, duration;
        Random rand = new Random();
        if(super.getRoamingTime()==0)
        {
            duration = 60;
        }
        else
        {
            duration = super.getRoamingTime();
        }
        int lama = rand.nextInt(duration);
        ttl_range = lama * speed;
        System.out.println("roaming for total range of " + ttl_range + " in " + duration + " minutes");
    }
    
    @Override public void makeSound1()
    {
        System.out.println("ruff ruff <3");
    }
    
    @Override public void makeSound2(){
        System.out.println("awooo!!");
    }
}
