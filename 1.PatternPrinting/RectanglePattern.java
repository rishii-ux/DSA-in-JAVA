
/*
QUESTION:
Given n, print an n x m square using '*'.

Input:
n=4
m=5

Output:
*****
*****
*****
*****
*/

import java.util.Scanner;

public class RectanglePattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();
        System.out.println("Enter the value of m: ");
        int m = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
    }
}