/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11.christiano.es.mathematics;

/**
 *
 * @author Christiano E S
 */
public class SimpleCalculator implements Calculator 
{
    private int first, second;
    
    public SimpleCalculator(int first, int second)
    {
        this.first = first;
        this.second = second;
    }
    
    @Override
    public Integer Add() 
    {
        return first + second;
    }
    
    @Override
    public Integer Subs() 
    {
        return first - second;
    }
    
    @Override
    public Integer Multi() 
    {
        return first * second;
    }
    
    @Override
    public Integer Div() 
    {
        return first / second;
    }
}
