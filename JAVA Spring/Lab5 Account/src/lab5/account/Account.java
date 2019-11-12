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
public class Account {
    private String acId = "";
    private double balance = 0.0;
    
    public Account(){}
    public Account(String acNo, double bal)
    {
        this.acId = acNo;
        this.balance = bal;   
    }
    
    void showAccInfo()
    {
        System.out.println("A/C no " + this.acId);
        System.out.println("Balance " + this.balance);
    }
    
}
