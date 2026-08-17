/*
QUESTION:
Given a sorted array containing duplicate elements and a target x,
find the last occurrence of x.

Example:
arr = [1, 2, 2, 2, 3, 4]
x = 2

Output:
3
*/


import java.util.Scanner;

public class Last_Occurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the element whose last occurence is to be searched in the array: ");
        int x = in.nextInt();
        for (int i = arr.length-1; i > 0; i--) {
            if(arr[i]==x){
                System.out.println("The last occurence of "+x+" is at index: "+i);
            }
        }
        in.close();
    }
}
