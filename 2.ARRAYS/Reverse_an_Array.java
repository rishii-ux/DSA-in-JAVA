/*
QUESTION:
Given an integer array arr[], reverse the array in-place.

Example:
Input:
[1, 2, 3, 4, 5]

Output:
[5, 4, 3, 2, 1]

Requirement:
- Do not create another array.
*/

import java.util.Scanner;

public class Reverse_an_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println("The reversed array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        in.close();
    }
}
