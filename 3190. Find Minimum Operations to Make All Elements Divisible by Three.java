class Solution {
    public int minimumOperations(int[] nums) {

        int min_oper = 0;
        for(int i = 0; i < nums.length; i ++)
        {
            if(nums[i]%3 != 0)
            {
                min_oper += 1;
            }
        }
        return min_oper;
        
    }
}