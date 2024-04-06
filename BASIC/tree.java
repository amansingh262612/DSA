public class tree {
    public static void tree(int loop) {
        int count = 1;
        for (int i = 0; i < loop; i++) {
            // for spacce
            for (int j = 0; j < loop - i; j++) {
                System.out.print(" ");
            }
            // for stars or element

            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        tree(3);
    }
}
