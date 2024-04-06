import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Sorting {
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printarr2(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

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
            // correct posy finder
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }

        // for printing
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void inbuiltsort(Integer arr[]) {
        // Arrays.sort(arr);

        Arrays.sort(arr, 0, 3);
        // printing the array

        Arrays.sort(arr, Collections.reverseOrder());
        printarr2(arr);

        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        printarr2(arr);
    }

    public static void coutingsort(int arr[]) {
        // for Range Calculation:
        int Range = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            Range = Math.max(Range, arr[i]);
        }
        // for updating freq:
        int count[] = new int[Range + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // for actual sorting:
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }

        }
        // for printing
        printarr(arr);
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
        // int arr[] = { 5, 4, 1, 3, 2 };
        // insertionSort(arr);
        // ---------------
        // Integer arr[] = { 4, 5, 1, 3, 2 };
        // inbuiltsort(arr);
        // -------------------
        // int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        // coutingsort(arr);
        // -----------

    }
}
