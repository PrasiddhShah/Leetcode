class Solution {
public:
    int findMaxK(vector<int>& nums) {
        for(int i = 0; i < nums.size(); i++) {
        for(int j = 0; j < nums.size() - i - 1; j++) {
            if(nums[j] > nums[j+1]) {
                std::swap(nums[j], nums[j+1]);
            }
        }
    }
    
    int largest_elemt = 0;
        for(int k = nums.size() - 1; k >= 0 ; k--)
        {
            if(nums[k] < 0)
            {
                return -1;
            }
            for(int l = 0; l<nums.size();l++)
            {
                
                    if((nums[k]) == (nums[l]*(-1)))
                    {
                        largest_elemt = nums[k];
                        return largest_elemt;
                    }
            }
        }
        return -1;
    }
};