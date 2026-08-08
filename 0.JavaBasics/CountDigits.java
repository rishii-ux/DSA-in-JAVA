

/*
QUESTION:
Given an integer n, count how many digits it contains.

Example:
Input: 12345
Output: 5

Input: 7
Output: 1
*/
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int ctr = 0;
        while (n > 0) {
            ctr++;
            n /= 10;
        }
        System.out.println("Number of digts present in the number:"+ctr);
        in.close();
    }
}