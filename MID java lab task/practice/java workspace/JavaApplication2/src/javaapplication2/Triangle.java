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
public class Triangle {
    
    private
            int x,y,z;
    public
            Triangle(){};
            Triangle(int x, int y, int z)
            {
                this.x = x;
                this.y = y;
                this.z = z;
            }
            
            void showInfo()
            {
                System.out.println("X = " + x);
                System.out.println("Y = " + y);
                System.out.println("Z = " + z);
                
            }
            
            void testTriangle()
            {
                if(x==y && y==z)
                     System.out.println("Equilateral");

                 else if(x >= (y+z) || z >= (y+x) || y >= (x+z) )
                    System.out.println("Not a triangle");
                
                    else if ((x==y && y!=z ) || (x!=y && z==x) || (z==y && z!=z))
                         System.out.println("Isosceles");

                         else if(z!=y && y!=z && z!=x)
                                System.out.println("Scalene");
            }
    
}
