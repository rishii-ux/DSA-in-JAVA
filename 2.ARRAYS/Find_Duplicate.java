/*
QUESTION:
Given an array containing n+1 integers where each integer is
between 1 and n, find the duplicate number.

Example:
Input:
[1, 3, 4, 2, 2]

Output:
2
*/

import java.util.Scanner;

public class Find_Duplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("The duplicate element in the array is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i]);
                    break;
                }
            }
        }
        in.close();
    }
}
