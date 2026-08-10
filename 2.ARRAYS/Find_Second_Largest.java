/*
QUESTION:
Given an integer array arr[], find the second largest DISTINCT element.

Example:
Input:
[10, 5, 20, 8, 20]

Output:
10

Important:
20 occurs twice but should still be considered only once.
*/


import java.util.Scanner;

public class Find_Second_Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();
        int arr[] = new int[size];
        int max=Integer.MIN_VALUE,SecondMax=Integer.MIN_VALUE;
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            if(max<arr[i]){
                SecondMax=max;
                max=arr[i];
            }
            if (arr[i] > SecondMax && arr[i] != max) {
                SecondMax = arr[i];
            }
        }
        System.out.println("The Second largest number in the array is: "+SecondMax);
        in.close();
    }
}
