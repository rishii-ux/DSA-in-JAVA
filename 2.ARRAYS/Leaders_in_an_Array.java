/*
QUESTION:
An element is called a leader if it is greater than or equal to
all elements to its right.

Find all leaders in the array.

Example:
Input:
[16, 17, 4, 3, 5, 2]

Output:
[17, 5, 2]

The last element is always a leader.
*/


import java.util.Scanner;

public class Leaders_in_an_Array {
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
        
        int ctr=0;
        for (int i = 0; i < arr.length; i++) {
            boolean leader=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    leader=false;
                    break;
                }
            }
            if(leader==true){
                brr[ctr++]=arr[i];
            }
        }
        System.out.println("All leaders in the array are: ");
        for (int i = 0; i < ctr; i++) {
            System.out.print(brr[i]+" ");
        }
        in.close();
    }
}