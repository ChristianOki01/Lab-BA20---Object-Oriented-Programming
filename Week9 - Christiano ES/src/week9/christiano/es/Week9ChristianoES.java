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
public class Week9ChristianoES 
{

    /**
     * @param args the command line arguments
     */
    public static Scanner christiano = new Scanner(System.in);
    
    public static ArrayList<Animal> data = new ArrayList<>();
    
    public static int canmax = 0, cannow = 0, felmax = 0, felnow = 0;
    
    public static void clrscr()
    {
        for (int i = 0; i < 30; ++i) 
            System.out.println();
    }
    
    public static void AnimalMood()
    {
        for(int i=0; i<data.size(); i++)
            
        if(data.get(i).getGenus().compareTo("canine")==0)
        {
            if(canmax == 1 && cannow == 1)
            {
                data.get(i).setMood("happy");
            }
            else if(cannow < canmax)
            {
                data.get(i).setMood("unhappy");
            }
            else
            {
                data.get(i).setMood("unhappy");
            }
        }
        else if(data.get(i).getGenus().compareTo("feline")==0)
        {
            if(felmax == 1 && felnow == 1)
            {
                data.get(i).setMood("unhappy");
            }
            else if(cannow < canmax)
            {
                data.get(i).setMood("happy");
            }
            else
            {
                data.get(i).setMood("unhappy");
            }
        }
    }
    
    
    public static void AddAnimal(ArrayList<Animal> data)
    {
        String name, gender, genus; 
        int speed;
        do
        {
            System.out.print("What's the name [5 - 15 characters]? ");
            name = christiano.nextLine();
        }
        while(name.length() < 5 && name.length() > 15);
        
        do
        {
            System.out.print("What's its gender [male | female]? ");
            gender = christiano.nextLine();
        }
        while(gender.compareTo("male")!=0 && gender.compareTo("female")!=0);
        
        do
        {
            System.out.print("What's its genus [canine | feline]? ");
            genus = christiano.nextLine();
        }
        while(genus.compareTo("canine")!=0 && genus.compareTo("feline")!=0);
        
        if(genus.compareTo("canine")==0)
        {
            do
            {
                System.out.print("What's its speed [1 - 80]? ");
                speed = christiano.nextInt();
            }
            while(speed<1||speed>80);
            
            Canine cn = new Canine(name, gender, genus, speed);
            data.add(cn);
            canmax++;
            cannow++;
        }
        else
        {
            Feline fn = new Feline(name, gender, genus);
            data.add(fn);
            felmax++;
            felnow++;
        }
        System.out.println("Another animal has joined the zoo!!");
        christiano.nextLine();
    }
    
    public static void ViewAnimal(ArrayList<Animal> data)
    {
        System.out.println("|=========================================================|");
        System.out.println("+ No. | Name             | Genus    | Mood       | Gender +");
        System.out.println("+=========================================================+");
        if(data.isEmpty())
        {
            System.out.println("+ No Zoo Animal Spotted                                   +");  
            System.out.println("+=========================================================+");
        }  
        else
        {
            AnimalMood();
            for(int i=0; i<data.size(); i++)
            {
               System.out.printf("+ %d   | %-16s | %-8s | %-10s | %-6s |\n", i+1, data.get(i).getName(), data.get(i).getGenus(), data.get(i).getMood(), data.get(i).getGender());
            }
            System.out.println("+=========================================================+");
        }   
    }
    
    
    public static void TakeAnimal(ArrayList<Animal> data)
    {
        int nomor, roaming, time;  
        System.out.println("|=========================================================|");
        System.out.println("+ No. | Name             | Genus    | Mood       | Gender +");
        System.out.println("+=========================================================+");
        if(data.isEmpty())
        {
            System.out.println("+ No Zoo Animal Spotted                                   +");  
            System.out.println("+=========================================================+");
        }
        else
        {
            AnimalMood();
            for(int i=0; i<data.size(); i++)
            {
               System.out.printf("+ %d   | %-16s | %-8s | %-10s | %-6s |\n", i+1, data.get(i).getName(), data.get(i).getGenus(), data.get(i).getMood(), data.get(i).getGender());
            }
            System.out.println("+=========================================================+");
            do
            {
                System.out.print("Choose animal to take for a stroll [1 - " + data.size() +"] : ");
                nomor = christiano.nextInt();
            }
            while(nomor<=0 || nomor>data.size());
            do
            {
                System.out.println("Input roaming time [0 - 50]: ");
                roaming = christiano.nextInt();
            }
            while(roaming<0||roaming>50);
            if(roaming == 0)
            {
                time = 60;
            }
            else
            {
                time = roaming;
            }
            data.get(nomor-1).setRoamingTime(time);
            data.get(nomor-1).roam();
        }
    }
    

    public static void ReleaseAnimal(ArrayList<Animal> data)
    {
        int choice;
        Random rand = new Random();
        System.out.println("|=========================================================|");
        System.out.println("+ No. | Name             | Genus    | Mood       | Gender +");
        System.out.println("+=========================================================+");
        if(data.isEmpty())
        {
            System.out.println("+ No Zoo Animal Spotted                                   +");  
            System.out.println("+=========================================================+");
        }
        else
        {
            AnimalMood();
            for(int i=0; i<data.size(); i++)
            {
               System.out.printf("+ %d | %-16s | %-8s | %-10s | %-6s |\n", i+1, data.get(i).getName(), data.get(i).getGenus(), data.get(i).getMood(), data.get(i).getGender());
            }
            System.out.println("+=========================================================+");
            do
            {
                System.out.print("Choose animal that wants to be released[1 - " + data.size() +"] : ");
                choice = christiano.nextInt();
            }
            while(choice<=0 || choice>data.size());
            
            int nomor = data.size();
            int number = rand.nextInt(nomor+1);
            if(data.get(choice-1).getGenus().compareTo("canine")==0)
            {
                if(data.get(number).getGenus().compareTo("canine")==0)
                {
                    if(data.get(choice-1).getGender().compareTo(data.get(number).getGender())!=0)
                    {
                        data.get(choice-1).makeSound1();
                        if(choice-1==number)
                        {
                            data.remove(choice-1);
                            cannow--;
                        }
                        else
                        {
                            data.remove(choice-1);
                            data.remove(number);
                            cannow-=2;
                        }
                    }
                    else
                    {
                        data.get(choice-1).makeSound2();
                        data.remove(choice-1);
                        cannow--;
                    }
                }
                else
                {
                    data.get(choice-1).makeSound2();
                    data.remove(choice-1);
                    cannow--;
                }
            }
            else if(data.get(choice-1).getGenus().compareTo("feline")==0)
            {
                if(data.get(number).getGenus().compareTo("feline")==0)
                {
                    if(data.get(choice-1).getGender().compareTo(data.get(number).getGender())!=0)
                    {
                        data.get(choice-1).makeSound1();
                        if(choice-1 == number)
                        {
                            data.remove(choice-1);
                            felnow--;
                        }
                        else
                        {
                            data.remove(choice-1);
                            data.remove(number);
                            felnow-=2;
                        }
                    }
                    else
                    {
                        data.get(choice-1).makeSound2();
                        data.remove(choice-1);
                        felnow--;
                    }
                }
                else
                {
                    data.get(choice-1).makeSound2();
                    data.remove(choice-1);
                    felnow--;
                }
            }
        }
    }
        
    
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int choice;
        System.out.println(" _______        __             ______    ______    ______");
        System.out.println("/\\  ==  \\      /\\ \\           /\\___  \\  /\\  __ \\  /\\  __ \\");
        System.out.println("\\ \\   __<     _\\_\\ \\          \\/_/  /__ \\ \\ \\/\\ \\ \\ \\ \\/\\ \\");
        System.out.println(" \\ \\______\\  /\\_____\\           /\\_____\\ \\ \\_____\\ \\ \\_____\\");
        System.out.println("  \\/______/  \\/_____/           \\/_____/  \\/_____/  \\/_____/\n");
        do
        {
            System.out.println("+===================+");
            System.out.println("Menu List");
            System.out.println("+===================+");
            System.out.println("1. Add Zoo Animal");
            System.out.println("2. View Zoo Animal");
            System.out.println("3. Take for A Walk");
            System.out.println("4. Release Zoo Animal");
            System.out.println("5. Close Program");
            System.out.println("+===================+");
            System.out.print("Choice : ");
            choice = christiano.nextInt();
            christiano.nextLine();
            clrscr();
            
            switch(choice)
            {
                case 1:
                {
                    clrscr();
                    AddAnimal(data);
                    christiano.nextLine();
                    break;
                }
                
                case 2:
                {
                    clrscr();
                    ViewAnimal(data);
                    christiano.nextLine();
                    break;
                }
                
                case 3:
                {
                    clrscr();
                    TakeAnimal(data);
                    christiano.nextLine();
                    break;
                }
                
                case 4:
                {
                    clrscr();
                    ReleaseAnimal(data);
                    christiano.nextLine();
                    break;
                }
            }
        }
        while(choice!=5);
    } 
}
