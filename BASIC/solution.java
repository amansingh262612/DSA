class Solution {
    public static void sortColors(int[] nums) {
        int n = nums.length;
        // outer loop
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j <= n - 2; j++) {
                // for swaping
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        // for printing
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 2, 1, 0 };
        sortColors(nums);
    }
}