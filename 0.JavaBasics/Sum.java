/*
QUESTION:
Given an integer n, calculate the sum of all its digits.

Example:
Input: 12345
Output: 15
*/
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d;
            n/=10;
        }
        System.out.println("The sum of digits is: "+sum);
        in.close();
    }
}