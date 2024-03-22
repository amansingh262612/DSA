import java.util.*;

public class array {
    public static void change(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }

    // Linear Search
    public static void Linear_Search(int arr[], int key) {
        // for outer loop
        int count = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
                index = i;
            }
        }
        if (count > 0) {
            System.out.println("Found at index :" + (index + 1) + " is :" + key);
        } else {
            System.out.println("Element not found!!");
        }

    }

    // String Linear Search
    public static void String_Linear_Search(String Strarr[], String Key) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < Strarr.length; i++) {
            if (Strarr[i].equals(Key)) {
                count++;
                index = i;
            }
        }
        if (count > 0) {
            System.out.println("Found :" + Strarr[index]);
        } else {
            System.out.println("not Found !");
        }
    }

    // Maximum Number in Array:

    public static int Maxnos(int arr[]) {
        int maxnos = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxnos) {
                maxnos = arr[i];
            }
        }
        return maxnos;
    }

    // BINARY SEARCH
    public static int BinarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return arr[mid];
            }
            // left
            if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // Reverse an Array
    public static void ReverseArray(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int temp = 0;
            temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }

    // Pairs of Array
    public static void Pairs_of_array(int arr[]) {
        // outer loop
        int total_pairs = 0;
        for (int i = 0; i < arr.length; i++) {
            // for internal loops 1st element
            // System.out.print(arr[i] + " ");
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs:" + total_pairs);
    }

    public static void Sub_Array(int arr[]) {
        int total_sub_arrays = 0;
        int maximum_sum = Integer.MIN_VALUE;
        int minimum_sum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);
            int sum = 0;
            int inner_limit = i;
            while (inner_limit < arr.length) {
                for (int j = i; j <= inner_limit; j++) {
                    System.out.print(arr[j] + " ");

                    sum = sum + arr[j];
                }
                System.out.println("Sum of the given sub array is: " + sum);
                if (sum > maximum_sum) {
                    maximum_sum = sum;
                }
                if (sum < minimum_sum) {
                    minimum_sum = sum;
                }
                sum = 0;
                total_sub_arrays++;
                inner_limit++;
                System.out.println();
            }
        }
        System.out.println("The maximum sum of the given subarray :" + maximum_sum);
        System.out.println("The Minimum sum of the given subarray :" + minimum_sum);
        System.out.println("Total nos of Sub Array is : " + total_sub_arrays);
    }

    // MAXIMUM SUBARRAY - Brute Force Method
    public static void MaxSubArray_brutefore(int arr[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k < end; k++) {
                    currsum += arr[k];
                    System.out.println(currsum);
                }
                if (currsum < 0) {
                    currsum = 0;
                }
                if (maxsum < currsum) {
                    maxsum = currsum;
                }

            }
        }
        System.out.println("Max sum is" + maxsum);
    }

    // MAXIMUM SUBARRAY - Prefix Method
    public static void MaxSubArray_PrefixMethod(int arr[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix_arr[] = new int[arr.length];
        prefix_arr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix_arr[i] = prefix_arr[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currsum = start == 0 ? prefix_arr[end] : prefix_arr[end] - prefix_arr[start - 1];

                if (currsum < 0) {
                    currsum = 0;
                }
                if (maxsum < currsum) {
                    maxsum = currsum;
                }

            }
        }
        System.out.println("Max sum is" + maxsum);
    }

    public static void MaxSubArray_KadanceAlgo(int arr[]) {
        int maximum_sum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < arr.length; i++) {
            currsum = currsum + arr[i];
            if (currsum < 0) {
                currsum = 0;
            }
            if (currsum > maximum_sum) {
                maximum_sum = currsum;
            }

        }
        System.out.println("Maximum sum of subarray is:" + maximum_sum);
    }

    /* Trapped Rainwater using Auxalary Array */
    public static void Trapped_rainwater(int height[], int width) {
        int n = height.length;
        // for Left max Boundary: Auxalary Array :
        int Left_max[] = new int[n];
        Left_max[0] = height[0];
        for (int i = 1; i < n; i++) {
            Left_max[i] = Math.max(height[i], Left_max[i - 1]);
        }
        // for Right Max Boundary: Auxalary Array :
        int Right_max[] = new int[n];
        Right_max[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            Right_max[i] = Math.max(height[i], Right_max[i + 1]);
        }
        // now for calculating Water level & Trapped water:
        int Trappedwater = 0;
        for (int i = 0; i < n; i++) {
            int water_level = Math.min(Left_max[i], Right_max[i]);
            Trappedwater += water_level - height[i] * width;
            System.out.println("Trapped water for " + i + " : " + Trappedwater);
        }

    }

    /* Buy Sell Stock :MEthod 1 maybe wrong */
    public static void BuySellStocks_1(int prices[]) {
        int n = prices.length;
        // for MIN COST PRICE:
        int cost_price = Integer.MAX_VALUE;
        // For MAX FINAL PROFIT:
        int final_profit = Integer.MIN_VALUE;
        // temp variable for Profit;
        int profit = 0;
        // for caculating profit & Final profit:
        for (int i = 0; i < n; i++) {
            cost_price = Math.min(cost_price, prices[i]);
            // profit=Selling price - Cost price
            profit = prices[i] - cost_price;
            System.out.println("Profit no:" + i + " : " + profit);
            if (profit < 0) {
                profit = 0;
            }
            // for Final Profit (maximum)
            final_profit = Math.max(final_profit, profit);
        }
        System.out.println("The max profit we can get:" + final_profit);
    }

    /* Buy Sell Stock :MEthod 2 correct but Doubt */
    public static int BuySellStocks_2(int prices[]) {
        int buy_price = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buy_price < prices[i]) {
                System.out.println(buy_price);
                int profit = prices[i] - buy_price;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buy_price = prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[] = { 21, 22, 23 };
        // change(arr);
        // // update value ::::::::::::
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        /*
         * LINEAR SEARCH
         * -----------------
         */
        // int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        // System.out.println("Enter your key element to search:");
        // int key = sc.nextInt();
        // Linear_Search(arr, key);
        /* ================= */
        // Linear Search in STRING Array:::::::::
        // String Strarr[] = { "rajmachawal", "masala dosa", "pavbhaji" };
        // String Key = "masala dosa";
        // String_Linear_Search(Strarr, Key);
        /*
         * =============
         * Maximum Number in the array:
         */
        // int arr[] = { 2, 4, 1, 8, 7, 12, 11 };
        // System.out.println(Maxnos(arr));
        // -----------------------
        /* Binary Search */
        // int arr[] = { 1, 3, 5, 6, 8, 9 };
        // System.out.println("Enter the key element to search");
        // int key = sc.nextInt();
        // System.out.println(BinarySearch(arr, key));
        // ---------------------------------
        /* Reverse an Array */
        // int arr[] = { 2, 4, 1, 5, 7 };
        // ReverseArray(arr);
        // System.out.println("Sorted array:");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // --------------------
        /* Pairs in array */
        // int arr[] = { 2, 4, 6, 8, 10 };
        // Pairs_of_array(arr);
        // -----------------------------
        /* Sub Arrays */
        // int arr[] = { 2, 4, 6, 8, 10 };
        // Sub_Array(arr);
        // --------------------------
        // int arr[] = { 1 };
        // MaxSubArray_brutefore(arr);
        // -------------------------
        // int arr[] = { 1, -2, 6, -1, 3 };
        // MaxSubArray_PrefixMethod(arr);
        // --------------------
        // int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // MaxSubArray_KadanceAlgo(arr);
        // ------------------------
        // int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        // int width = 1;
        // Trapped_rainwater(height, width);
        // ---------------------------
        // Buy Sell stocks : Method 1
        // int prices[] = { 7, 1, 5, 3, 6, 4 };
        // BuySellStocks_1(prices);
        // Method 2
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("max profit :" + BuySellStocks_2(prices));


        
    }
}



