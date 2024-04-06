public class D2Array {
    public static void spiral(int arr[][]) {
        int n = arr.length;
        int row = arr.length;
        int col = arr[0].length;
        // defining elements:
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------");
        // =====

        int start_row = 0;
        int end_row = row - 1;
        int start_col = 0;
        int end_col = col - 1;

        // now for looping
        while (start_row <= end_row && start_col <= end_col) {

            // for top
            for (int j = start_col; j <= end_col; j++) {
                System.out.print(arr[start_row][j] + " ");
            }

            // for right
            for (int i = start_row + 1; i <= end_row; i++) {
                System.out.print(arr[i][end_col] + " ");
            }

            // for bottom
            for (int j = end_col - 1; j >= start_col; j--) {
                if (start_row == end_row) {
                    break;
                }
                System.out.print(arr[end_row][j] + " ");

            }

            // for left
            for (int i = end_row - 1; i >= start_row + 1; i--) {
                if (start_col == end_col) {
                    break;
                }
                System.out.print(arr[i][start_col] + " ");
            }
            start_row++;
            start_col++;
            end_row--;
            end_col--;
        }
    }

    public static void diagonalsum(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;

        // for diagonals sum:
        int left_sum = 0;
        int right_sum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // for right diagnal:
                if (i == j) {
                    right_sum += arr[i][j];
                }

                // for left diagonal:
                if (j == (col - i - 1) && j != i) {
                    left_sum += arr[i][j];
                }
            }
        }
        System.out.println("Right diagnal sum is :" + right_sum);
        System.out.println("left diagnal sum is :" + left_sum);
        System.out.println("total sum: " + (right_sum + left_sum));

    }

    public static void diagonalsumOPTIMISED(int arr[][]) {
        int len = arr.length;
        int left_sum = 0;
        int right_sum = 0;
        for (int i = 0; i < len; i++) {
            // right sum
            right_sum += arr[i][i];

            // left sum (without repeating elements)
            if (i != (len - 1 - i)) {
                left_sum += arr[i][len - i - 1];
            }

        }
        System.out.println("total sum: " + (left_sum + right_sum));
    }

    public static void starisCaseSearching(int arr[][], int key) {
        int row = arr.length;
        int col = arr[0].length;
        int count = 0;
        // right top
        int i = 0;
        int j = col - 1;
        while (i < row && j >= 0) {
            if (key == arr[i][j]) {
                count++;
                break;
            }
            if (key < arr[i][j]) {
                // for going LEFT
                j--;
            } else {
                // for going Bottom
                i++;
            }
        }

        if (count > 0) {
            System.out.println("Element found !");
        } else {
            System.out.println("not found !!");
        }

    }

    public static void main(String[] args) {
        // int arr[][] = { { 1, 2, 3, 4, },
        // { 5, 6, 7, 8 },
        // { 9, 10, 11, 12 },
        // { 13, 14, 15, 16 } };

        // spiral(arr);

        // -----------------
        // int arr[][] = { { 1, 2, 3, 4, },
        // { 5, 6, 7, 8 },
        // { 9, 10, 11, 12 },
        // { 13, 14, 15, 16 } };
        // diagonalsum(arr);
        // O(n^2)
        // -----
        // optimised method O(n):
        // int arr[][] = { { 1, 2, 3, 4, },
        // { 5, 6, 7, 8 },
        // { 9, 10, 11, 12 },
        // { 13, 14, 15, 16 } };
        // diagonalsumOPTIMISED(arr);
        // -----
        // int arr[][] = { { 10, 20, 30, 40 },
        // { 15, 25, 35, 45 },
        // { 27, 29, 37, 48 },
        // { 32, 33, 39, 50 } };
        // int key = 39;
        // starisCaseSearching(arr, key);
        // ---------------------

    }
}
