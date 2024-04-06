public class waterproble {
    public static int waterproblem(int height[]) {
        int n=height.length;
        // for left max 
        int left_max[]=new int[n]; 
        left_max[0]=height[0];
        for(int i=1;i<n;i++){
            left_max[i]=Math.max(left_max[i-1],height[i]);
        }
        // for Right max
        int right_max[]=new int [n];
        right_max[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            right_max[i]=Math.max(right_max[i+1],height[i])
        }

        // water level + trapped water
        int totaltrappedwater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.max(right_max[i],left_max[i]);
            totaltrappedwater+=height[i]-waterlevel;
        }

        return totaltrappedwater;

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        waterproblem(height);
    }
}
