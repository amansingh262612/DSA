import java.util.*;

import javax.sound.midi.Soundbank;

public class advancepattern {
    public static void Hollow_Rectangle(int row, int column) {
        // outer loop for row
        // int lo = 1; <---- for nos printing in boundary
        for (int i = 1; i <= row; i++) {
            // inner loop for columns
            for (int j = 1; j <= column; j++) {
                // Boundary Check condition
                if (i == 1 || i == row || j == 1 || j == column) {
                    // System.out.print(lo + " ");
                    // lo++;
                    System.out.print("x");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void Ulta_Half_star_triangle(int nos) {
        for (int i = 1; i <= nos; i++) {
            // for space printing
            for (int j = 1; j <= nos - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void Ulta_half_nos_triangle(int nos) {

        for (int i = 1; i <= nos; i++) {
            for (int j = 1; j <= nos + 1 - i; j++) {
                System.out.print(j);

            }
            System.out.println();
        }
    }

    public static void Floyd_triangle(int nos) {
        // nos for no of lines
        // value for adding nos to the output result
        int value = 1;
        for (int i = 1; i <= nos; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value++;
            }
            System.out.println("");
        }
    }

    public static void Triangle_0_1(int nos) {
        for (int i = 1; i <= nos; i++) {
            for (int j = 1; j <= i; j++) {
                // for even sum of row col = 1; for odd sum of row col =0 ;
                if ((i + j) % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println("");

        }
    }

    public static void Triangle(int n) {
        for (int i = 1; i <= n; i++) {
            // blanks
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Butterfly(int nos) {
        for (int i = 1; i <= nos; i++) {
            // UPPER HALF
            // ----
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // blank space
            for (int j = 1; j <= 2 * (nos - i); j++) {
                System.out.print(" ");
            }
            // for Right Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // next line
            System.out.println();
        }
        // LOWER Half
        // ----
        // OUTLINE
        for (int i = 1; i <= nos; i++) {
            // Left stars
            for (int j = 1; j <= nos + 1 - i; j++) {
                System.out.print("*");
            }
            // for space
            for (int j = 2; j <= 2 * i - 1; j++) {
                System.out.print(" ");
            }
            // for right star
            for (int j = 1; j <= nos + 1 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void Rhombus(int nos) {
        // for lines
        for (int i = 1; i <= nos; i++) {
            // for space
            for (int j = 1; j <= nos - i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= nos; j++) {
                System.out.print("*");
            }
            // next line
            System.out.println();
        }
    }

    public static void Diamond(int nos) {
        // FOR UPPER HALF
        for (int i = 1; i <= nos; i++) {
            // for blanks
            for (int j = 1; j <= nos - i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= ((2 * (i - 1)) + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // FOR LOWER HALF
        for (int i = 1; i <= nos; i++) {
            // for blanks
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= 2 * (nos - i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Number_Pyramid(int nos) {
        // outter loop for lines
        for (int i = 1; i <= nos; i++) {
            // for Space
            for (int j = 1; j <= nos - i; j++) {
                System.out.print(" ");
            }
            // for ELEMENTS
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        // Hollow_Rectangle(10, 5);
        // Ulta_Half_star_triangle(4);
        // Ulta_half_nos_triangle(5);
        // Floyd_triangle(5);
        // Triangle_0_1(5);
        // Triangle(4);
        // Butterfly(4);
        // Rhombus(5);
        // Diamond(4);
        Number_Pyramid(5);
    }
}
