/*
Print the following pattern: 
*             *
* *         * *
* * *     * * *
* * * * * * * *
* * * * * * * *
* * *     * * *
* *         * *
*             *
*/
public class ButterflyPattern {
    public static void main(String[] args) {
        int i = 0, j;
//Prints the upper half
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (j = 1; j <= 2 * (4 - i); j++) {
                System.out.print("  ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Prints th lower half
        for (i = 4; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (j = 1; j <= 2 * (4 - i); j++) {
                System.out.print("  ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
