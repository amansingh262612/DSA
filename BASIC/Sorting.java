public class Sorting {
    public static void BubbleSort(int arr[]) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j <= n - 2 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void BubbleSortOptimal(int arr[]) {
        int n = arr.length;
        int temp = 0;
        int swap = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j <= n - 2 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = swap + 1;
                    if (swap > 0) {
                        break;
                    }
                }
            }
        }
        if (swap == 0) {
            System.out.println("already sorted");
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void SelectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minposy = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[minposy] > arr[j]) {
                    minposy = j;
                }
            }
            // swap
            int temp = arr[minposy];
            arr[minposy] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // for correct posy
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // for insertion
            arr[prev + 1] = curr;
        }

        // for printing
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // initial array
        // int arr[] = { 1, 3, 4 };
        // BubbleSort(arr);
        // BubbleSortOptimal(arr);
        // ---------------------
        // int arr[] = { 5, 4, 1, 3, 2 };
        // SelectionSort(arr);
        // ===========
        int arr[] = { 5, 4, 1, 3, 2 };
        insertionSort(arr);

    }
}
