class Solution {
    public int findPeakElement(int[] nums) {
        int p=nums[0], i=0;
        for(int a = 1;a<nums.length;a++){
            if(p<nums[a]){
                p=nums[a];
                i=a;
            }
        }
        return i;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna