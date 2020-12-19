package com.devaloo;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // Basics

        System.out.println("Hello World ..!");
	System.out.print("Thanks");
        double d = 3.14256;
        int myInt = (int)d;
        System.out.println(d);
        System.out.println(myInt);

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer :");
        int i = scan.nextInt();
        System.out.println("Enter an double :");
        double myDouble = scan.nextDouble();
        System.out.println("you entered "+i);
        System.out.println("Your double is "+myDouble);
        System.out.println("Enter your name : ");
        scan.nextLine();
        String ss = scan.nextLine();
        System.out.println("\nWelcome "+ss);


//         Arithmetic Operators

        int a = 4;
        int b = 10;
        int c = (a*b);
        double d = b/a;
        int e = b++;
        int f = ++a + b++;
        int h = a%b;
        System.out.println(h);
        System.out.println(c);
        System.out.println(d);
        System.out.println(b);
        System.out.println(e);
        System.out.println(f);

//         Bitwise Operators

        int a = 10; //    1010
        int b = 6; //     0110
        int c = a & b; // 0010 --> 2
        System.out.println(c);
        int d = a|b; //   1110 --> 14
        System.out.println(d);
        int e = a^b; //   1100 --> 12
        System.out.println(e);
        int f = a>>2; //  1010 >> 2 --> 0010 --> 2
        System.out.println(f);
        int g = b<<3; //  0110 << 3 --> 110000 --> 48
        System.out.println(g);

//         Assignment Operators

        int a = 10;
        int b = 20;
        b = b+a;
        System.out.println(b);
        b += a;
        System.out.println(b);
        b /= 5;
        System.out.println(b);
        b >>= 2;
        System.out.println(b);
        b %= 25;
        System.out.println(b);

//         Comparision Operations

        int a = 10;
        int b = 20;
        System.out.println(a<b);
        System.out.println(a>=b);
        boolean isAHigher = a!=b;
        System.out.println(isAHigher);

//         Logical Operators

        int a = 10;
        int b = 20;
        boolean x = (a==10) && (b!=20);
        boolean y = (a==10) || (b==0);
        boolean z = !(a!=10);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

//         Conditional Statements

        int a = 20;
        int b = 10;
        if (a<b) {
            System.out.println("a < b");
        } else if (a>b) {
            System.out.println("a > b");
        } else {
            System.out.println("a = b");
        }

//         Ternary Operator --> condition ? expressionTrue : expressionFlase;

        int a = 10;
        int b = a<=10 ? 20:10;
        System.out.println(b);

//         Largest of three numbers

        int x = 5;
        int y = 10;
        int z = 8;
        int result;
        result = x>y ? x>z ? x : z : y>z ? y : z;
        System.out.println(result);

    }
}
