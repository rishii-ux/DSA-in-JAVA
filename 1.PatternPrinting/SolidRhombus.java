
/*
QUESTION:
Given n, print:

Input:
5

Output:
        * * * * *
      * * * * *
    * * * * *
  * * * * *
* * * * *
*/
import java.util.Scanner;

public class SolidRhombus {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the value of n: ");
    int n = in.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    in.close();
  }
}
