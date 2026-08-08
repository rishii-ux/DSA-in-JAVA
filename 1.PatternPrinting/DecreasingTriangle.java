// QUESTION:
// Given n, print:

// Input:
// 5

// Output:
// *****
// ****
// ***
// **
// *
import java.util.Scanner;

public class DecreasingTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
    }
}
