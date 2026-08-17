/*
QUESTION:
Given an array arr[] and a target value x, find the index of x.

If x does not exist, return -1.

Example:
arr = [10, 20, 30, 40]
x = 30

Output:
2
*/

import java.util.Scanner;

public class Linear_Search {
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
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                System.out.print("The element "+x+" found at: "+i);
            }
        }
        in.close();
    }
}
