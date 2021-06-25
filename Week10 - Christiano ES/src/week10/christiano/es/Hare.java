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
public class Hare extends Animal implements Comparable <Animal>
{
    private int move;
    private int distance = 0;
    
    public Hare(String type, String name, int speed)
    {
        super(type, name, speed);
    }
    
    @Override public int move()
    {
        Random rand = new Random();
        this.move = rand.nextInt(super.getSpeed()+1);
        return move;
    }
    
    @Override void setDistance() 
    {
        this.distance = distance + move;
    }
    
    @Override public int getDistance()
    {
        return distance;
    }

    @Override void resetDistance() 
    {
        this.distance = 0;
    }

    @Override
    public int compareTo(Animal H) 
    {
        int comparedistance = ((Animal)H).getDistance();
        return this.distance-comparedistance;
    }
    
}
