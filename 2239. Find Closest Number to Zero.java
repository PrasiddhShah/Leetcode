class Solution {
    public int findClosestNumber(int[] nums) {
        int clostest_num = Integer.MAX_VALUE;
        int temp = Integer.MIN_VALUE;
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(Math.abs(clostest_num) == Math.abs(nums[i]))
            {
                clostest_num = Math.max(nums[i],nums[j]);
                continue;
            }
            if(Math.abs(clostest_num) > Math.abs(nums[i]))
            {
                clostest_num = nums[i];
                j = i;
            }
            
        }
        return clostest_num;
    }
}