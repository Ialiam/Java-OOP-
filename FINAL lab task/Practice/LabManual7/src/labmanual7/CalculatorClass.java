/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labmanual7;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author student
 */
public class CalculatorClass {
    
    private double x;
    private double y;

    public CalculatorClass(){}
    public CalculatorClass(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double add(double x, double y){
        return x+y;
    }
    public double sub(double x, double y){
        return x-y;
    }
    public double mul(double x, double y){
        return x*y;
    }
    public double div(double x, double y){
        
        try{
           if(y == 0.0);
        }catch(ArithmeticException e){
            System.out.println("Divide by zero");
        }  
        finally{
        return x/y;
        }
    } 
    
    
}
