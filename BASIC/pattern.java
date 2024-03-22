
class pattern {

    public static void main(String[] args) {
        int nos = 4;

        // //SIDHA STAR
        // for (int i = 1; i <= nos; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println(" ");
        // }

        // /* --------------------- */
        // // ULTA STAR
        // System.out.println(" ");
        // // lower loop
        // for (int r = 1; r <= nos; r++) {
        // for (int s = 1; s <= nos - r + 1; s++) {
        // System.out.print("x");
        // }
        // System.out.println(" ");
        // }

        /* ---------- */
        char ch = 'A';
        for (int i = 1; i <= nos; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println(" ");
        }
        int n = 1;
        int loop = 4;
        // char chs = '1';
        for (int i = 1; i < loop; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(n);
                n++;
            }
            System.out.println(" ");
        }
        System.out.println("");
        int ns = 10;
        for (int i = 1; i <= loop; i++) {

            for (int j = 1; j <= loop - i + 1; j++) {
                System.out.print(ns + " ");
                ns--;
            }
            System.out.println(" ");
        }
    }
}