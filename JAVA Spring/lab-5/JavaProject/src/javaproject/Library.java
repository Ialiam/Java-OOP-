package javaproject;

public class Library {
    private String libName = "";
    private String liAddress = "";
    private Book[] listofBook = new Book[1000];
    private int totalNumOfBook = 0;
    private Account libAcc;
    private double totalCharge=0; 
    
    public Library(){}
    public Library(String libName, String libAddress){
    this.libName=libName;
    this.liAddress=libAddress;
    }
    
    public void addBook(Book book){
    this.listofBook[this.totalNumOfBook]=book;
    this.totalNumOfBook++;
    }
    
    public void deleteBook(Book book){
        int i;
        for(i=0;i<this.totalNumOfBook;i++){
        if(this.listofBook[i]==book){
            break;
        }
        else
            System.out.println("This book is not available in the library :)");
        }
        if(i==this.totalNumOfBook){
        this.totalNumOfBook--;}
        else{
        this.listofBook[i]=this.listofBook[this.totalNumOfBook];
        this.totalNumOfBook--;
        }    
    }
    
    public void lateDeposit(int day){
        totalCharge=day*10;
    }
    
    public double getTotalChagre(){return this.totalCharge;}
    
    public Account getLibAcc(){return this.libAcc;}
    
    public void addNewCopy(Book book, int copy){
    book.addCopy(copy);
    }
    
    
}
