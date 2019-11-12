/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Ashfaq Afzal Chowdhury
 */

public class Account {
    String accName;
    String acId;
    double balance;
    
    
    
    public Account(){
        //default constructor
    }
    
    public Account(String Name, String Id, double amount){
        this.accName = Name;
        this.acId = Id;
        this.balance = amount;
    }
   public void deposit(double amount)
   {
       this.balance = this.balance + amount;
       this.showMessage(amount + "Deposited to A/C " + this.acId); 
   }
   
   public void withdraw(double amount)
   {
       this.balance = this.balance - amount;
       this.showMessage(amount + "Withdrawn from A/C " + this.acId); 
   }
   
   public void showMessage(String msg)
   {
       System.out.println("\nMessage " + msg);
   }
   
   public void showInfo()
   {
        System.out.println("Account Name: " + this.accName);
        System.out.println("Account ID: " + this.acId);
        System.out.println("Account Balance: " + this.balance);
   }
   
   public void transfer(double amount, Account reciever)
   {
       reciever.balance = reciever.balance + amount;
       this.balance = this.balance - amount;
       System.out.println("transfered from A/C" + this.acId + "to A/C" + reciever.acId);
       this.showInfo();
       reciever.showInfo();
   }
}


    

