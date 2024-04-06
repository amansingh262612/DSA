class rotate {
    public static void Rotate(int arr[]) {
        int n = 3;
        // Rotate the given array by n times toward right
        for (int i = 0; i < n; i++) {
            int j, last;
            // Stores the last element of array
            last = arr[arr.length - 1];

            for (j = arr.length - 1; j > 0; j--) {
                // Shift element of array by one
                arr[j] = arr[j - 1];
            }
            // Last element of array will be added to the start of array.
            arr[0] = last;
        }

        // for printing array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        Rotate(arr);
    }
}
