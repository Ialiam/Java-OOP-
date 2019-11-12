/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labmanual4;

/**
 *
 * @author Ashfaq Afzal Chowdhury
 */
public class Transaction {
    private Account sender;
    private Account reciever;
    private double amount;
    private String additionalInfo="";
    
    
    public Transaction(){}
    public Transaction(Account s,Account r,double a,String info){
        this.sender=s;
        this.reciever=r;
        this.amount=a;
        this.additionalInfo=info;
    }
    public void showInfo(){
        System.out.println(additionalInfo+":\nSent by: "+sender.getName()+"\nRecieved by: "+reciever.getName()+"\nAmount " +amount);
    }
    
}
