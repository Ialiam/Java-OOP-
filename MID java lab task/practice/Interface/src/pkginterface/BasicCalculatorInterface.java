/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author student
 */
public class BasicCalculatorInterface implements BasicCalculator{
    
    public int sum(int x, int y){
        int z = x + y;
        return z;
    } 
    
    public int sub(int x, int y){
        int z = x - y;
        return z;
    }
    public int multiplication(int x, int y){
        int z = x * y;
        return z;
    }
    public int division(int x, int y){
        int z = x + y;
        return z;
    }
    public int sqr(int x){
        int z = x * x;
        return z;
    }
    
}

