/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.accounttransactionproject;

/**
 *
 * @author Dr. Kamruddin Nur
 */
public class Transaction {
    //Members Variables / Properties
    private Account sender;
    private Account receiver;
    private double amount;
    private String additionalInfo;
    
    //constructors
    public Transaction(){}
    
    public Transaction(Account s, Account r, double am, String aInfo){
    this.sender = s;
    this.receiver = r;
    this.amount = am;
    this.additionalInfo = aInfo;
    }
    
    public void showInfo(){
    System.out.println("Transaction Info:");
    System.out.println("Sender A/C: " + this.sender.getAccNo());
    System.out.println("Receiver A/C: " + this.receiver.getAccNo());
    System.out.println("Amount Transferred: " + this.amount);
    System.out.println("Additional Info: " + this.additionalInfo);
    System.out.println();
    }
    
}//end of class
