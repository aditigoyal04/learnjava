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
public class MethodsTest1 {
    void method()
    {
        System.out.println("Hello I am inside method");
    }
    public static void main(String[] args) {
        {
            MethodsTest1 mwe= new MethodsTest1();
            mwe.method();
            mwe.method();
            mwe.method();
            mwe.method();
            mwe.method();
            MethodsTest1 mwe1 = new MethodsTest1();
            mwe1.method();
        }
    }
}
