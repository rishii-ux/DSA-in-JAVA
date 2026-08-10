/*
QUESTION:
Given an integer array arr[], find the minimum element.

Example:
Input:
[10, 5, 20, 8, 15]

Output:
5

Do not sort the array.
*/

import java.util.Scanner;

public class FindMinimumElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();
        int arr[] = new int[size];
        int min=Integer.MAX_VALUE;
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("The minimum element present in the array is: "+min);
        in.close();
    }
}
