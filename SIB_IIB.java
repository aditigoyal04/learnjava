/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Day4;

/**
 *
 * @author boss 123
 */
public class SIB_IIB {
    int a,b,c,d;
    static int i,j,k,l;
    {
        a=12;b=12;c=12;d=a+b;
        System.out.println("Day4.SIB_IIB.instanc");
    }
    static
    {
        i=11;j=11;k=11;l=11;
        System.out.println("Day4.SIB_IIB.static");
    }
    public static void main(String[] args) {
        SIB_IIB si= new SIB_IIB();
        System.out.println(si.a+" "+si.b+" "+si.c+" "+si.d);
        si.a++;
        System.out.println(si.i + " " + si.j + " " + si.k + " " + si.l);
        si.i++;
        System.out.println(si.a + " " + si.b + " " + si.c + " " + si.d);
        System.out.println(si.i + " " + si.j + " " + si.k + " " + si.l);
        SIB_IIB si1=new SIB_IIB();
        System.out.println(si1.a+" "+si1.b+" "+si1.c+" "+si1.d);
        si1.a++;
        System.out.println(si1.i + " " + si1.j + " " + si1.k + " " + si1.l);
        si1.i++;
        System.out.println(si1.a + " " + si1.b + " " + si1.c + " " + si1.d);
        System.out.println(si1.i + " " + si1.j + " " + si1.k + " " + si1.l);
        
    }
}

