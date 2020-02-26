package com.klu;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        long c=sc.nextLong();
        long p=sc.nextLong();
        Add a=new Add();
        System.out.println("The addition  is"+a.Add(c, p));
        sub s=new sub();
        System.out.println("The substraction is"+s.sub(c, p));
        mul m=new mul();
        System.out.println("The multiplication is"+m.mul(c, p));
        modulo mo=new modulo();
        System.out.println("The multiplication is"+mo.modulo(c, p));
    }
}
