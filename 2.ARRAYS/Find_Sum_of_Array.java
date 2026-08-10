/*
QUESTION:
Given an integer array arr[], calculate the sum of all elements.

Example:
Input:
[1, 2, 3, 4, 5]

Output:
15
*/
import java.util.Scanner;

public class Find_Sum_of_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();
        int arr[] = new int[size];
        int sum=0;
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            sum+=arr[i];
        }
        System.out.println("The sum of the lements present in the array is: "+sum);
        in.close();
    }
}

