/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deptinheritance.labmanual5;

/**
 *
 * @author Ashfaq Afzal Chowdhury
 */
public class BBA extends Department {
    
    private String deptName = "BBA";
    private int creditFee = 5000;
    
    public BBA(){
        getDeptName();
    }
    
    public String getDeptName()
    {
        return deptName;
    }
    

    public void calculateSemesterFee(int credit)
    {
       int x = credit*creditFee;
       System.out.println("Semester Fee is : " + x + " Taka");
    }
    
}
