


/*
QUESTION:
Given an integer n, determine whether it is a palindrome.

A number is a palindrome if it reads the same from left to right
and right to left.

Example:
Input: 121
Output: true

Input: 123
Output: false

Input: 1221
Output: true
*/
import java.util.Scanner;

public class CheckPalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int rev=0;
        int k = n;
        while (k > 0) {
            int d = k % 10;
            rev = rev * 10 + d;
            k /= 10;
        }
        if (rev == n) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        in.close();
    }

}