package com.devaloo;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Switch Statements

        int dayOfWeek = 3;
        switch(dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter correct dayOfWeek");
        }

        // Calculator - Basic

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first integer : ");
        int a = scan.nextInt();
        System.out.println("Enter second integer : ");
        int b = scan.nextInt();
        System.out.println("Enter operation (+, -, *, /, %)");
        scan.nextLine();

        char operation = scan.nextLine().charAt(0);
        int result;
        switch(operation) {
            case '+':
                result = a+b;
                break;
            case '-':
                result = a-b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                result = a/b;
                break;
            case '%':
                result = a%b;
                break;
            default:
                result = 0;
                System.out.println("Invalid Operation");
        }
        System.out.println("Result is : "+result);
        scan.close();

        // For Loop  --> for (initialization; condition; increment/decrement )

        int table = 5;
        for(int i=1;i<=10;i++) {
            System.out.println(table+" * "+i+" = "+(table*i));
        }

        // Factorial

        int n = 6;
        int factorial = 1;
        for (int i=1;i<=n;i++) {
            factorial *= i;
        }
        System.out.println("Factorial of "+n+" is "+factorial);

        // Fibonacci Sequence

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of Fibonacci Series : ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=0;i<n-2;i++) {
            int c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
        in.close();

        // Prime Number [Yes/No]

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        scan.close();
        boolean isPrime = true;
        if (n<=1)
            isPrime = false;
        else {
            for(int i=2;i*i<=n;i++) {
                if (n%i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(n+" is prime : "+isPrime);
        scan.close();

        // Serial Sum -> 1 + 1/2 + 1/3 + 1/4 + ..... + 1/n

        int n = 5;
        double sum = 0;
        for(double i=1;i<=n;i++) {
            sum += 1/i;
        }
        System.out.println(sum);

        // Serial Sum 2 -> 1 - 1/2 + 1/3 -1/4 + 1/5 - 1/6 + .... 1/n

        int n = 5;
        double sum = 0;
        for(double i=1;i<=n;i++) {
            if (i%2 == 0)
                sum -= 1/i;
            else
                sum += 1/i;
        }
        System.out.println(sum);

    }
}
