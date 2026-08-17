
/* 
QUESTION:
Given n, print:

Input:
5

Output:
1 2 3 4 5
1 2 3 4 
1 2 3 
1 2 
1
*/
import java.util.Scanner;

public class DecreasingTrianglenumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(n - j + 1 + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
