import java.util.Arrays;

public class SortedArrayMedian {
    public static void Median(int arr1[], int arr2[]) {
        int m = arr1.length;
        int r = arr2.length;
        int Merged[] = new int[m + r];
        int mlen = Merged.length;

        // for 1st array to Merged
        for (int i = 0; i < m; i++) {
            Merged[i] = arr1[i];
        }
        // for 2nd array to Merged
        for (int i = 0; i < r; i++) {
            Merged[m + i] = arr2[i];
        }
        // sorting
        Arrays.sort(Merged);

        // printing array:
        for (int i = 0; i < mlen; i++) {
            System.out.print(Merged[i] + " ");
        }

        // median
        if (mlen % 2 == 0) {
            int n = mlen;
            int first_element = (n / 2) - 1;
            int second_element = (n / 2);
            System.out.println("first element :" + Merged[first_element]);
            System.out.println("Second element :" + Merged[second_element]);
            double sumoftwo = Merged[first_element] + Merged[second_element];
            System.out.println("sum of two element:" + sumoftwo);
            double median = (sumoftwo / 2.0);
            System.out.println("Median of even is:" + median);
        } else {
            int n = mlen;
            int element = ((n - 1) / 2);
            System.out.println("element of odd :" + Merged[element]);
            int median = (Merged[element]);
            System.out.println("Median of odd is:" + median);
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 3 };
        int arr2[] = { 2, 4, 5 };
        Median(arr1, arr2);

    }
}
