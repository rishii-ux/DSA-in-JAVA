
/*
QUESTION:
Given n, print an n x n square using '*'.

Input:
5

Output:
*****
*****
*****
*****
*****
*/
import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
    }
}