/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day4;

/**
 *
 * @author boss 123
 */
public class MethodsTest7 {
    
    public static void main(String[] args) 
    {
        MethodsTest7 ad = new MethodsTest7();
        
     
        ad.display(ad.area(12));
    }
    double area(float r)
    {
        double a= (22.0/7.0)*r*r;
        return a;
    }
    void display(double d1)
    {
        System.out.println(d1);
    }
    
    
}
