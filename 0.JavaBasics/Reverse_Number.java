/*
QUESTION:
Given an integer n, reverse its digits and return the reversed number.

Example:
Input: 12345
Output: 54321

Input: 1200
Output: 21

Requirements:
- Do not convert the number into a String.
- Use arithmetic operations such as %, /.
*/
import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int rev=0;
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        System.out.println("The reversed number is: "+rev);
        in.close();
    }
}