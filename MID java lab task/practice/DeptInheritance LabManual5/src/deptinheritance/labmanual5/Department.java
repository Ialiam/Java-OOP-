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
abstract public class Department {
    
    private String deptName;
    private int creditFee;
    
    public Department(){}
    public Department(String deptName, int creditFee)
    {
        this.deptName = deptName;
        this.creditFee = creditFee;
    }
    
    public String getDeptName()
    {
        return deptName;
    }
            
    abstract public void calculateSemesterFee(int credit);
   

}
