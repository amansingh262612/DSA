public class TrappedRainwater {
    public static void TrappedRainwater(int height[]) {
        int n = height.length;
        // Auxilary array for Left_max
        int Left_max[] = new int[n];
        Left_max[0] = height[0];
        for (int i = 1; i < n; i++) {
            Left_max[i] = Math.max(Left_max[i - 1], height[i]);
        }
        // Auxilary array for Right_max
        int Right_max[] = new int[n];
        Right_max[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            Right_max[i] = Math.max(Right_max[i + 1], height[i]);
        }
        int Total_trapped_water = 0;
        // Trapped Rainwater:
        for (int i = 0; i < n; i++) {
            int water_level = 0;
            // water Level
            water_level = Math.min(Left_max[i], Right_max[i]);
            Total_trapped_water += water_level - height[i];
        }
        System.out.println("Total Trapped water is :" + Total_trapped_water);
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        TrappedRainwater(height);
    }
}
