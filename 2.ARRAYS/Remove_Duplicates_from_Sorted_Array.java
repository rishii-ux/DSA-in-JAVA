/*
QUESTION:
Given a sorted integer array arr[], remove duplicate elements
in-place and return the number of unique elements.

Example:
Input:
[1, 1, 2, 2, 3, 4, 4]

Output:
Unique elements:
[1, 2, 3, 4]

Number of unique elements:
4
*/

import java.util.Scanner;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();
        int arr[] = new int[size];
        int brr[] = new int[size];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int ctr = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                brr[ctr] = arr[i];
                ctr++;
            }
        }
        brr[ctr] = arr[arr.length - 1];
        ctr++;
        System.out.println("The array after removing duplicate elements: ");
        for (int i = 0; i < ctr; i++) {
            System.out.print(brr[i] + " ");
        }
        System.out.println("Number of unique elements: " + ctr);
        in.close();
    }
}