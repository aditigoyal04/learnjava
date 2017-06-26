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
public class MethodTest8 {
    public static void main(String[] args) {
        MethodTest8 mw = new MethodTest8();
        System.out.println(mw.sum("3","4",5,6,7,8,5,3,2,6));
        System.out.println(mw.sum("1","5"));
        System.out.println(mw.sum("",""));
    }
    int sum(String b1,String b2,int... a)
    {
        int b=0;
        for(int c:a)
        {
            b=b+c;
        }
        return b;
    }
}
