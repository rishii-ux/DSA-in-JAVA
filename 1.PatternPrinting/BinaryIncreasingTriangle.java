/*
QUESTION:
Given n, print the following pattern.

Input:
5

Output:
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/
import java.util.Scanner;

public class BinaryIncreasingTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2==0){   //The logic behind lies in this line.
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
