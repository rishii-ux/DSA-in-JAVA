/*
QUESTION:
Given an array arr[] and an integer k, rotate the array to the
left by k positions.

Example:
Input:
arr = [1, 2, 3, 4, 5]
k = 2

Output:
[3, 4, 5, 1, 2]
*/

import java.util.Scanner;

public class Rotate_Array_by_K_Positions {
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
        System.out.println("Enter the value of k: ");
        int k = in.nextInt();
        int ctr = 0;
        for (int j = k; j < size; j++) {
            brr[ctr++] = arr[j];
        }
        for (int j = 0; j < k; j++) {
            brr[ctr++] = arr[j];
        }
        System.out.println("The array after rotating the array to the left by k positions: ");
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+" ");
        }
        in.close();
    }
}
