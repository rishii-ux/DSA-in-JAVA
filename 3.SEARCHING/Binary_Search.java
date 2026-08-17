/*
QUESTION:
Given a sorted array arr[] and a target value x, find the index
of x using binary search.

If x does not exist, return -1.

Example:
arr = [1, 3, 5, 7, 9]
x = 7

Output:
3

Requirement:
- Do not use built-in search functions.
*/

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the element to be searched in the array: ");
        int x = in.nextInt();
        int start = 0, end = arr.length - 1, mid;
        while (start < end) {
            mid = (start + end) / 2;
            if (arr[mid] > x) {
                end--;
            } else if (arr[mid] < x) {
                start++;
            } else {
                System.out.print("The element " + x + " is at index: " + mid);
                break;
            }
        }
        in.close();
    }
}
