/*
QUESTION:
Given an integer array arr[], find the maximum element.

Example:
Input:
arr = [10, 5, 20, 8, 15]

Output:
20

Do not sort the array.
*/
import java.util.Scanner;

public class FindMaximumElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();
        int arr[] = new int[size];
        int max=Integer.MIN_VALUE;
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("The maximum element present in the array is: "+max);
        in.close();
    }
}
