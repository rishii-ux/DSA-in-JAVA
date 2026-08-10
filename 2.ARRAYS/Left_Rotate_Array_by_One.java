/*
QUESTION:
Given an array, rotate all elements one position to the left.

Example:
Input:
[1, 2, 3, 4, 5]

Output:
[2, 3, 4, 5, 1]
*/

import java.util.Scanner;

public class Left_Rotate_Array_by_One {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
        System.out.println("The array after rotating all elements one position to the left is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        in.close();
    }
}
