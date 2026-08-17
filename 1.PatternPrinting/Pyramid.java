/*
QUESTION:
Given n, print:

Input:
5

Output:

    *
   ***
  *****
 *******
*********
*/
import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();
        in.close();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
    }
}
