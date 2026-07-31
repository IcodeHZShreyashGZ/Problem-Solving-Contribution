class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int maxArea = 0;
        int pl = 0;
        int pr = len - 1;
        
        while (pl < pr) {
            int width = pr - pl;
            int currheight = Math.min(height[pl], height[pr]);
            int area = width * currheight;

            maxArea = Math.max(maxArea, area);

            if (height[pl] < height[pr]) {
                pl++;
            } else {
                pr--;
            }
        }
        
        return maxArea;
    }
}