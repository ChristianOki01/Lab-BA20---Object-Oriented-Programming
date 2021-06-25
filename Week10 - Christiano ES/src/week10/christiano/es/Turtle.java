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
public class Turtle extends Animal implements SpecialMove, Comparable <Animal>
{
    private int boost;
    private int Smove;
    private int move;
    private int distance = 0;
    
    public Turtle(String type, String name, int speed)
    {
        super(type, name, speed);
    }

    @Override public int specialMove()
            {
                Random rand = new Random();
                Smove = rand.nextInt(10);
                if(Smove>7)
                {
                    boost = 15;
                }
                else
                {
                    boost = 0;
                }
                return boost;
            }
    
    @Override public int move()
    {
        Random rand = new Random();
        specialMove();
        this.move = rand.nextInt(super.getSpeed()+1) + rand.nextInt(11) + Smove + boost;
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
    public int compareTo(Animal T) {
        int comparedistance = ((Animal)T).getDistance();
        return this.distance-comparedistance;
    }
    
    
}
