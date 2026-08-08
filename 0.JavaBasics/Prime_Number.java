
/*
QUESTION:
Given an integer n, determine whether n is prime.

A prime number has exactly two positive divisors:
1 and itself.

Example:
Input: 7
Output: true

Input: 10
Output: false
*/
import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int ctr = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                ctr++;
            }
        }
        if(ctr==2){
            System.out.println("The number is a Prime Number.");
        }
        else{
            System.out.println("The number is not a Prime Number.");
        }
        in.close();
    }
}