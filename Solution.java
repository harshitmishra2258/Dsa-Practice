public class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            // Calculate the width between the two pointers
            int width = right - left;
            
            // The height of the water is limited by the shorter line
            int currentHeight = Math.min(height[left], height[right]);
            
            // Update maxWater if the current container holds more
            int currentArea = width * currentHeight;
            maxWater = Math.max(maxWater, currentArea);

            // Strategy: Move the pointer pointing to the shorter line 
            // to try and find a taller line that compensates for the lost width.
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] testInput = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Maximum water: " + sol.maxArea(testInput)); // Output: 49
    }
}
