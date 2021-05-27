/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.christiano.es;
import java.util.Scanner;

/**
 *
 * @author Christiano E S
 */


public class Week4ChristianoES 
{
    public static void clrscr()
    {
        for (int i = 0; i < 50; ++i) 
            System.out.println();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int choice;
        String paragraf="", save, new_paragraf="", kata;
        do
        {
            clrscr();
            System.out.println("Menu : ");
            System.out.println("=======");
            System.out.println("1. Input Paragraf");
            System.out.println("2. Tambah Paragraf");
            System.out.println("3. Lihat Paragraf");
            System.out.println("4. Cari Kata");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            Scanner christiano = new Scanner(System.in);
            choice = christiano.nextInt();
            christiano.nextLine();
            clrscr();
            
            switch(choice)
            {
                case 1:
                {
                    
                    if(paragraf.compareTo("")!=0)
                    {
                        System.out.println("Paragraf sudah ada");
                    }
                    else
                    {
                        System.out.println("Silahkan masukkan paragraf anda : \n");
                        paragraf = christiano.nextLine();
                        do
                        {
                            System.out.print("\nApakah anda akan menyimpan [Y/T]? ");
                            save = christiano.next();
                            christiano.nextLine();
                        }
                        while(save.compareTo("Y")!=0 && save.compareTo("y")!=0 && 
                              save.compareTo("T")!=0 && save.compareTo("t")!=0);
                        
                        if(save.compareTo("Y")==0 || save.compareTo("y")==0)
                        {
                            System.out.println("\nParagraf berhasil disimpan");
                            System.out.print("Press any key to continue...");
                            christiano.nextLine();
                        }
                        else
                        {
                            paragraf = "";
                            System.out.println("Paragraf tidak disimpan");
                            System.out.print("Press any key to continue...");
                            christiano.nextLine();
                        }
                    }    
                    break;
                }
                
                case 2:
                {
                    if(paragraf.compareTo("")==0)
                    {
                        System.out.println("Belum ada paragraf yang dimasukkan");
                        System.out.print("Press any key to continue...");
                        christiano.nextLine();
                    }
                    else
                    {
                        System.out.println("Paragraf yang sudah anda input : ");
                        System.out.println(paragraf);
                        System.out.println("\nSilahkan masukkan paragraph baru : \n");
                        new_paragraf = christiano.nextLine();
                        paragraf = paragraf.concat(" " + new_paragraf);
                        System.out.println("Paragraf berhasil ditambah");
                        christiano.nextLine();
                    }
                    break;
                }
                
                case 3:
                {
                    if(paragraf.compareTo("")==0)
                    {
                        System.out.println("Belum ada paragraf yang dimasukkan");
                        System.out.print("Press any key to continue...");
                        christiano.nextLine();
                    }
                    else
                    {
                        System.out.println(paragraf);
                        System.out.print("\nPress any key to continue...");
                        christiano.nextLine();
                    }
                    break;
                }
                
                case 4:
                {
                    int count = 0;
                    if(paragraf.compareTo("")==0)
                    {
                        System.out.println("Belum ada paragraf yang dimasukkan");
                        System.out.print("Press any key to continue...");
                        christiano.nextLine();
                    }
                    else
                    {
                        String cari[] = paragraf.split(" ");
                        do
                        {
                            System.out.print("Masukkan kata yang akan dicari : ");
                            kata = christiano.nextLine();
                        }
                        while(kata.compareTo("")==0 || kata.contains(" "));
                        
                        count = 0;
                        if(paragraf.contains(kata))
                        {
                            for(int i = 0; i<cari.length; i++)
                            {
                                if(kata.compareTo(cari[i])==0)
                                {
                                    count++;
                                }
                            }
                            System.out.println("Hasil : ");
                            System.out.println(kata + " sebanyak " + count + " kali");
                            
                            count = 0;
                            for(int i = 0; i<cari.length; i++)
                            {
                                if(kata.compareTo(cari[i])== 0)
                                {
                                    count++;
                                    System.out.println(kata + " " + count);
                                    if(i+1 == cari.length)
                                    {
                                        System.out.println("Kata sebelum : " + cari[i-1]);
                                        System.out.println("Kata sesudah : -\n");
                                    }
                                    else if(i-1 == -1)
                                    {
                                        
                                        System.out.println("Kata sebelum : -");
                                        System.out.println("Kata sesudah : " + cari[i+1] + "\n");
                                    }
                                    else
                                    {
                                        System.out.println("Kata sebelum : " + cari[i-1]);
                                        System.out.println("Kata sesudah : " + cari[i+1] + "\n");
                                    } 
                                }
                            }
                            System.out.print("Press any key to continue...");
                            christiano.nextLine();
                        }
                        else
                        {
                            System.out.println("Kata tidak berhasil ditemukan");
                            System.out.print("Press any key to continue...");
                            christiano.nextLine();
                        }
                    }
                    break;
                }
            }
        }
        while(choice!=5); 
    }
}
