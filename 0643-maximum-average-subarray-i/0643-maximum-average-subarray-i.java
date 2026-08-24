class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0,left=0;
       
        for(int i = 0;i<k;i++){
            sum+=nums[i];
        }
       int max=sum;
        for(int i =k;i<nums.length;i++){
            sum = sum - nums[left++];
            sum = sum + nums[i];
            max= Math.max(max,sum);
        }
        double avg = (double)max/k;
        return avg;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna