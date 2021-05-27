package week6.christiano.es;
import java.util.*;
/**
 *
 * @author christiano E S
 */
public class Week6ChristianoES 
{
    /**
     * @param args the command line arguments
     */
    public static void clrscr()
    {
        for (int i = 0; i < 50; ++i) 
            System.out.println();
    }
    
    public static Scanner christiano = new Scanner(System.in);
    
    private static LinkedHashMap<String, Integer> participants = new LinkedHashMap<>();
    
    private static void title()
    {
        System.out.println(" ________       ____                   _________   __    __   ________   ________     ___________");
        System.out.println("|   _    |     |    |                 |         | |  |  |  | |   __   | |     _  |   |           |");
        System.out.println("|  |_|   |     |    |     _______     |   ______| |  |__|  | |  |__|  | |    | | |   |     ______|");
        System.out.println("|        |     |    |    |_______|    |  |______  |        | |        | |    |_| |_  |    |______");
        System.out.println("|   _   |   ___|    |                 |______   | |        | |        | |     __   | |     ______|");
        System.out.println("|  |_|   | |        |                  ______|  | |   __   | |   __   | |    |  |  | |    |______");
        System.out.println("|________| |________|                 |_________| |__|  |__| |__|  |__| |____|  |__| |___________|\n");
    }
    
    private  static void showParticipants() 
    {
        System.out.println("+=======================================+");
        System.out.println("+ Share List                            +");
        System.out.println("+=======================================+");
        int i = 0;
        for (Map.Entry<String, Integer> participant : participants.entrySet()) 
        {
            System.out.println(String.format("| %d   | %-20s | %-8d |", ++i, participant.getKey(), participant.getValue()));
        }
        System.out.println("\n+=======================================+");
    }
    
    private static void insertParticipant(String username, int share) 
    {
        participants.put(username, share);
    }
    
    private static void updateParticipant(int index, int newShare) 
    {
        int i = 0;
        for (Map.Entry<String, Integer> participant : participants.entrySet()) 
        {
            if(++i == index) participants.put(participant.getKey(), newShare);
        }
    }
    
    private static void deleteParticipant(int index) 
    {
        int i = 0;
        for (Map.Entry<String, Integer> participant : participants.entrySet()) 
        {
            if(++i == index) participants.remove(participant.getKey(), participants.remove(participant.getValue()));
        }
    }
    
    public static void main(String[] args) 
    {
        int choice;
        title();
        do
        {
            System.out.println("+======================+");
            System.out.println("+Options               +");
            System.out.println("+======================+");
            System.out.println("+1. Start Sharing      +");
            System.out.println("+2. Update Participant +");
            System.out.println("+3. Delete Participant +");
            System.out.println("+4. Close App          +");
            System.out.println("+======================+");
            System.out.print("Choice >> ");
            choice = christiano.nextInt();
            christiano.nextLine();
            clrscr();
            
            switch(choice)
            {
                case 1:
                {
                    String username;
                    int share;
                    while (true) 
                    {
                        System.out.print("Input a number [0 - 100]: ");
                        try 
                        {
                            share = christiano.nextInt();
                            christiano.nextLine();
                        } 
                        catch (InputMismatchException ime) {
                            christiano.nextLine();
                            System.out.println("Input must be numeric");
                            continue;
                        }
                        if (share >= 0 && share <= 100) break;
                    }
                    while (true) 
                    {
                        System.out.print("Could you give me your username [5 - 20 characters]? ");
                        username = christiano.next();
                        if (username.length() >= 5 && username.length() <= 20) break;
                        if (participants.containsKey(username)) System.out.println("username has already been taken!!");
                    }
                    insertParticipant(username, share);
                    System.out.println("You are the " + participants.size() + " that joins the game");
                    System.out.println("Your share number : " + share);
                    christiano.nextLine();
                    break;
                }
                
                case 2:
                {
                    if (participants.size() > 0) 
                    {
                        int index;
                        while (true) 
                        {
                            showParticipants();
                            System.out.print("Which participant would you like to update [" + ((participants.size() > 1) ? ("1 - " + participants.size()) : "1") + "][0 to exit]? ");
                            try 
                            {
                                index = christiano.nextInt();
                                christiano.nextLine();
                            } 
                            catch (InputMismatchException ime) 
                            {
                                christiano.nextLine();
                                System.out.println("Input must be numeric");
                                continue;
                            }
                            if (index >= 0 && index <= participants.size()) {
                                if (index != 0) 
                                {
                                    int newShare;
                                    while (true) 
                                    {
                                        System.out.print("Input a number [0 - 100]: ");
                                        try 
                                        {
                                            newShare = christiano.nextInt();
                                            christiano.nextLine();
                                        } 
                                        catch (InputMismatchException ime) 
                                        {
                                            christiano.nextLine();
                                            System.out.println("Input must be numeric");
                                            continue;
                                        }
                                        if (newShare >= 0 && newShare <= 100) 
                                        break;
                                    }
                                    updateParticipant(index, newShare);
                                    System.out.println("Update successful!");
                                }
                                christiano.nextLine();
                                break;
                            }
                        }
                    }
                    break;
                }
                
                case 3:
                {
                    if (participants.size() > 0) 
                    {
                        int index;
                        while (true) 
                        {
                            showParticipants();
                            System.out.print("Which participant would you like to delete [" + ((participants.size() > 1) ? ("1 - " + participants.size()) : "1") + "][0 to exit]? ");
                            try 
                            {
                                index = christiano.nextInt();
                                christiano.nextLine();
                            } 
                            catch (InputMismatchException ime) {
                                christiano.nextLine();
                                System.out.println("Input must be numeric");
                                continue;
                            }
                            if (index >= 0 && index <= participants.size()) 
                            {
                                if (index != 0) 
                                {
                                    deleteParticipant(index);
                                    System.out.println("Participant successfully removed from event");
                                }
                                christiano.nextLine();
                                break;
                            }
                        }
                    }
                    break;
                }
                
                case 4:
                {
                    System.out.println("\nHere's the completed share list");
                    System.out.println("Remember, sharing is caring, happy sharing :D");
                    System.out.println("+==============================================+");
                    System.out.println("+ Share List                                   +");
                    System.out.println("+==============================================+");
                    System.out.println("+ Username                 | Before  | After   +");
                    System.out.print("+==============================================+");
                    ArrayList<String> username = new ArrayList<>();
                    ArrayList<Integer> number = new ArrayList<>();
                    for (Map.Entry<String, Integer> participant : participants.entrySet()) 
                    {
                        username.add(participant.getKey());
                        number.add(participant.getValue());
                    }
                    Collections.sort(username);
                    Collections.shuffle(number);
                    for(int i=0; i<participants.size(); i++)
                    {
                        System.out.printf("\n| %-24s | %-7d | %-7d |", username.get(i), participants.get(username.get(i)), number.get(i));
                    }
                    System.out.println("\n+==============================================+");
                    return;
                }
            }
        }
        while(choice!=5);
    }
}