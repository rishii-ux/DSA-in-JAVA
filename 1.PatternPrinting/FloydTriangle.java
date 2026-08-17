/*
QUESTION:
Print Floyd's Triangle for n rows.

Input:
5

Output:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();
        int ctr=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ctr+" ");
                ctr++;
            }
            System.out.println();
        }
        in.close();
    }
}
