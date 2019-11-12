/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labmanual5;

/**
 *
 * @author student
 */
public class Parent extends gParent {
    public String whoami = "";
    public String name = "";
    
    
    public Parent()
    {
        this.whoami = "Parent";
    }
    
    public Parent (String i)
    {
        this.whoami = "Parent";
        this.name = "A";
    }
    
    void showInfo()
    {
        System.out.println("I am " + this.whoami);
        System.out.println("My name is " + this.name);
    
            
    
}
    
}
