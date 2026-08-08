
/*
QUESTION:
Given two integers a and b, find their Greatest Common Divisor (GCD).

Example:
Input:
12 18

Output:
6

Try to solve this using Euclid's algorithm.
*/
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = in.nextInt();
        System.out.println("Enter second number: ");
        int b = in.nextInt();
        int GCD = 0;
        for (int i = 1; i < (int) Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                GCD = i;
            }
        }
        System.out.println("The GCD is: " + GCD);
        in.close();
    }
}