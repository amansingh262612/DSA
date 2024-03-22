class leetcode {
    public static void Pattern(int nos) {
        int col = 4;
        int loopduration = nos;
        while (loopduration != 0) {
            for (int i = 1; i < 4; i++) {
                for (int j = 1; j <= col; j++) {
                    if (i == j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");

            }
            for (int i = 1; i < 4; i++) {
                for (int j = 1; j <= col; j++) {
                    if (i + j == col + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
            loopduration--;
        }
    }

    public static void main(String[] args) {
        Pattern(2);
    }
}