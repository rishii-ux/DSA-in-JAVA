
/*
QUESTION:
Given an integer array arr[], determine whether it is a palindrome.

Example:
Input:
[1, 2, 3, 2, 1]

Output:
true

Input:
[1, 2, 3, 4]

Output:
false
*/
import java.util.Scanner;

public class Check_if_Array_is_Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("The reversed array is: ");
        int brr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[arr.length - i - 1];
            System.out.print(brr[i]+" ");
        }
        System.out.println();
         boolean palindrome = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != brr[i]) {
                palindrome=false;
                break;
            }
        }
        System.out.println(palindrome);
        in.close();
    }
}
