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
public class Animal 
{
	private String gender;
	private String name;
        private String genus;
	private String mood;
        private int roaming;
        
	public Animal() {}
	
	public Animal( String name, String gender, String genus) 
        {
		super();
                this.name = name;
		this.gender = gender;
                this.genus = genus;
	}

	public void makeSound1() 
        {
		System.out.println("animal: use growl!!");
	}
        
        public void makeSound2() 
        {
		System.out.println("animal: use growl!!");
	}
	
	public void selfComfort() 
        {
		System.out.println("animal comforting themselves");
	}
	
	public void roam() 
        {
		System.out.println("animal roams free");
	}

	public String getGender() 
        {
		return gender;
	}

	public void setGender(String gender) 
        {
		this.gender = gender;
	}

	public String getName() 
        {
		return name;
	}
        
	public void setName(String name) 
        {
		this.name = name;
	}
        
        public String getGenus() 
        {
		return genus;
	}
        
        public void setRoamingTime(int time)
        {
                this.roaming = time;
        }
        
        public int getRoamingTime()
        {
                return roaming;
        }
        
	public String getMood() 
        {
		return mood;
	}

	public void setMood(String mood) 
        {
		this.mood = mood;
	}
}
