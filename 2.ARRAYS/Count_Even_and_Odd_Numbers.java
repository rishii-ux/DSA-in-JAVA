/*
QUESTION:
Given an integer array arr[], count how many elements are even
and how many are odd.

Example:
Input:
[1, 2, 3, 4, 6]

Output:
Even = 3
Odd = 2
*/

import java.util.Scanner;

public class Count_Even_and_Odd_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in the array: ");
        int ctr_odd = 0, ctr_even = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            if (arr[i] % 2 == 0) {
                ctr_even++;
            } else {
                ctr_odd++;
            }
        }
        System.out.println("Even = " + ctr_even);
        System.out.println("Odd = " + ctr_odd);
        in.close();
    }
}
