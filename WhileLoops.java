package com.devaloo;

public class WhileLoops {
    public static void main(String[] args) {

        // While Loop --> while (condition) { .... }

        // Sum of digits of a number

        int num = 256;
        int sum = 0;
        int temp = num;
        while (num>0) {
            sum += num%10;
            num /= 10;
        }
        System.out.println("Sum of digits of "+temp+" is "+sum);

        // No. of digits in number num is : log10(num)+1

        // Palindrome Number

        int number = 102201;
        int reverseNumber = 0;
        int duplicate = number;
        while (duplicate>0) {
            int rem = duplicate%10;
            duplicate /= 10;
            reverseNumber = reverseNumber*10 + (rem);
        }
        if (reverseNumber == number) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");

        // do - while Loop -->  do { ... } while(condition);

        int n = 5;
        do {
            System.out.println("n = "+n);
            n--;
        } while(n != 0);

    }
}
