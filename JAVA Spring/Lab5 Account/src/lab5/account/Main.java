/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.account;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Customer c1 = new Customer("157415485154", "ABC");
        Account a1 = new Account("02451484", 12000);
        Account a2 = new Account("032451484", 50001);
        c1.addAccount(a2);
        c1.addAccount(a1);
        
        //c1.showInfo();
        c1.showInfo();
        //a2.showAccInfo();
        
        
        
        
        
    }
    
}
