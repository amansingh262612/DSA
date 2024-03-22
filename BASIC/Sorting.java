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

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        BubbleSort(arr);
    }
}
