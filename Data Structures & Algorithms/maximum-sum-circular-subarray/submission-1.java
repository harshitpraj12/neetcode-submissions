class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int maxSum = 0;
        int currMax = Integer.MIN_VALUE;
        int minSum = 0;
        int currMin = Integer.MAX_VALUE;
        for(int num : nums){
            total+=num;
            maxSum = Math.max(num, maxSum+num);
            currMax = Math.max(maxSum, currMax);
            minSum = Math.min(num, minSum+num);
            currMin = Math.min(minSum, currMin);
        }
        if(currMax<0){
            return currMax;
        }
        return Math.max(currMax, total-currMin);
    }
}