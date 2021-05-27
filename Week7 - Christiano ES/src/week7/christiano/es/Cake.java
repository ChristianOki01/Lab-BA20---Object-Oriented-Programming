/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.christiano.es;

/**
 *
 * @author Christiano E S
 */
public class Cake 
{
    String flavor, topping;
    int flour, sugar, status;

    Cake() {}

    Cake(String fla, int flo, String t) 
    {
        flavor = fla;
        flour = flo;
        sugar = 100;
        topping = t;
        status = 0; //1 = baked
    }

    public void bake() 
    {
        status = 1;
    }

    public void setTopping(String t) 
    {
        topping = t;
    }
}
