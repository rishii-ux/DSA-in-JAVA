/*
QUESTION:
Given an integer array arr[], determine whether it is sorted
in non-decreasing order.

Example:
[1, 2, 2, 4, 5] -> true

[1, 3, 2, 4] -> false
*/

import java.util.Scanner;

public class Check_if_Array_is_Sorted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        System.out.println(sorted);
        in.close();
    }
}
