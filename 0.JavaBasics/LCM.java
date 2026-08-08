/*
QUESTION:
Given two positive integers a and b, find their Least Common Multiple.

Example:
Input:
12 18

Output:
36
*/
import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = in.nextInt();
        System.out.println("Enter second number: ");
        int b = in.nextInt();
        int max=(int)Math.max(a,b);
        int LCM=0;
        while(true){
            if(max%a==0 && max%b==0){
                LCM=max;
                break;
            }
            max++;
        }
        System.out.println("The LCM is: "+LCM);
        in.close();
    }
}