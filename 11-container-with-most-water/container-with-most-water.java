class Solution {
    public int maxArea(int[] height) {
        int lb = 0;
        int rb = height.length-1;
        int maxWater=0;
        while(lb<rb){
            int Current_water_area = (rb-lb)* Math.min(height[lb],height[rb]);
            maxWater=Math.max(maxWater,Current_water_area);
            if(height[lb]<height[rb]){
                lb++;
                }else{
                    rb--;
                }
            }
            return maxWater;
        }
}
