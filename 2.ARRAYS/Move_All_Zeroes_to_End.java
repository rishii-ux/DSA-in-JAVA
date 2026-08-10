/*
QUESTION:
Given an integer array arr[], move all zeroes to the end while
maintaining the relative order of non-zero elements.

Example:
Input:
[0, 1, 0, 3, 12]

Output:
[1, 3, 12, 0, 0]

Try to solve it without creating another array.
*/

import java.util.Scanner;
public class Move_All_Zeroes_to_End {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                int temp=arr[i];
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                arr[arr.length-1]=temp;
            }
        }
        System.out.println("The array after moving all zeroes to the end is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        in.close();
     }
}
