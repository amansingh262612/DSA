import java.util.*;

public class method {
    public static int Change(int x) {
        int a = 5;
        return a;
    }

    public static int Sum(int y, int z) {
        int sum = y + z;
        return sum;
    }

    public static int fact(int f) {
        int temp = 1;
        for (int i = 1; i <= f; i++) {
            temp *= i;
        }
        return temp;
    }

    public static int Binomial(int n, int r) {
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr_fact = fact(n - r);
        int bico = n_fact / (r_fact * nmr_fact);
        return bico;
    }

    public static boolean Prime(int nos) {
        if (nos == 0 || nos == 1) {
            return false;
        }
        for (int i = 2; i <= nos / 2; i++) {
            if (nos % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void CheckPrime(int Range) {
        for (int i = 1; i <= Range; i++) {
            if (Prime(i) == true) {
                System.out.println(i + " is Prime ");
            }
        }
    }

    public static void Bideci(int nos) {
        int LastDigit = 0;
        int pow = 0;
        int Decimal = 0;
        while (nos != 0) {
            LastDigit = nos % 10;
            Decimal = Decimal + LastDigit * (int) Math.pow(2, pow);
            pow++;
            nos /= 10;
        }
        System.out.println(Decimal);
    }

    public static void Decib(int nos) {
        int rem;
        int Binary = 0;
        int powww = 0;
        while (nos != 0) {
            rem = nos % 2;
            Binary = Binary + rem * (int) Math.pow(10, powww);
            powww++;
            nos = nos / 2;
        }
        System.out.println(Binary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = 10;
        // int b = 12;
        // Change(a);
        // ---------------
        // System.out.println(a);
        // System.out.println(Sum(a, b));
        // --------------------
        /* Factorial Funtion - Helper function : */
        // int f = 5;
        // System.out.println(fact(f));
        // ---------------------------
        /* Uses Factorial function as helper function to get nCr = n!/r!*(n-r)! */
        // System.out.println(Binomial(5, 3));
        // --------------------------------
        /* Function to find prime nos */
        // System.out.println(Prime(7));
        // -------------------------------------
        /*
         * Function to check for prime nos in given range (using Prime() as a Ladder
         * Function to get the whole range of nos checked)
         */
        // CheckPrime(11);
        // --------------------------------------
        /* Binary to Decimal */
        // Bideci(sc.nextInt());
        // ------------------------------------------
        /* Decimal to Binary */
        Decib(sc.nextInt());
        // ------------------------------------------
        /*  */

    }
}
