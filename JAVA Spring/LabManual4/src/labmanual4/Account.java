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
public class Account {
    private String accName="";
    private String acid="";
    private double accBalance;
    private Transaction[] listOfTransaction;
    private int totalNumberOfTransaction=0;
    
    //construcor
    public Account(){}//empty
    
    //parameterized
    public Account(String name,String id,double balance){
    this.accName=name;
    this.acid=id;
    this.accBalance=balance;
    listOfTransaction = new Transaction[100];
    System.out.println("Account created");
    }
    public void addTransaction(Transaction object){
        this.listOfTransaction[totalNumberOfTransaction]=object;
        this.totalNumberOfTransaction++;
    }
    public void deposit(double amount){
        this.accBalance+= amount;
        Transaction t1= new Transaction(this,this,amount,"Deposit");
        this.addTransaction(t1);
    }
    public void withdraw(double amount){
        this.accBalance-= amount;
        Transaction t1= new Transaction(this,this,amount,"Withdraw");
        this.addTransaction(t1);
    }
    public void transfer(Account a2,double amount){
        this.accBalance-=amount;
        a2.setBalance(amount);
        Transaction t1= new Transaction(this,a2,amount,"Transfer");
        this.addTransaction(t1);
    }
    
    public String getName(){
        return accName;
    }
    public void setBalance(double amount){
        this.accBalance+=amount;
    }
    void showAllTransaction(){
        System.out.println("All Trabsactions for "+this.getName()+": \n");
        for(int i = 0 ;i < totalNumberOfTransaction; i++){
            System.out.println((i+1)+". ");
            listOfTransaction[i].showInfo();
            System.out.println("");
        }
    }
    public void showInfo(){
        System.out.println("Account Details: ");
        System.out.println("A/C Name: "+this.accName);
        System.out.println("A/C ID: "+this.acid);
        System.out.println("A/C Balance: "+this.accBalance);
        System.out.println("------------ ");
    }
    
}