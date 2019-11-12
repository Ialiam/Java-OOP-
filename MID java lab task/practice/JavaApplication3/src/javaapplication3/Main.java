/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author aacfa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mobile m = new Mobile("Fahim", "0171420420", "79", "IOS 12.0.2", false);
        
        //m.showInfo();
        m.recharge(1);
        m.showInfo();
        
        
        

                
    }
    
}
