/*
QUESTION:
print:

      *
    * * *
  * * * * *
* * * * * * *
* * * * * * *
  * * * * *
    * * *
      *
*/

public class DiamondPattern {
    public static void main(String[] args) {

        // Upper half
        for (int i = 1; i <= 4; i++) {

            // Spaces
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower half
        for (int i = 4; i >= 1; i--) {

            // Spaces
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}