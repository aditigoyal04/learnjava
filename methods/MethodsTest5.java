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
public class MethodsTest5 {
    public static void main(String[] args) 
    {
        MethodsTest5 ad = new MethodsTest5();
        double dd = ad.area(12);
        System.out.println(dd);
    }
    double area(float r)
    {
        double a= (22.0/7.0)*r*r;
        return a;
    }
}
