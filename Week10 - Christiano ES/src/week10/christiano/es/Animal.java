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
public abstract class  Animal 
{
    private String type;
    private String name;
    private int speed;
    abstract int move();
    abstract void setDistance();
    abstract int getDistance();
    abstract void resetDistance();    
    
    
    
	public Animal( String type, String name, int speed) 
        {
		super();
                this.name = name;
		this.type = type;
                this.speed = speed;
	}

	public String getName() 
        {
		return name;
	}

	public void setName(String name) 
        {
		this.name = name;
	}

	public String getType() 
        {
		return type;
	}
        
	public void setType(String type) 
        {
		this.type = type;
	}
        
        
        public void setSpeed(int speed)
        {
                this.speed = speed;
        }
        
        public int getSpeed()
        {
                return speed;
        }
        
        
}
