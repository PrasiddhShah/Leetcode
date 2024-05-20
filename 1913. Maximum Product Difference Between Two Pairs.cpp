class Solution {
public:
    int maxProductDifference(vector<int>& nums) {

        for(int i = 0; i < nums.size();i++)
        {
            for(int j = 0; j < nums.size() - i - 1; j++)
            {
                if(nums[j] > nums[j+1]) {
                std::swap(nums[j], nums[j+1]);
            }
            }
        }

            cout<< " "<<nums[0]<< " " ;

        
        return abs(((nums[0]*nums[1]) - (nums[nums.size()-1] * nums[nums.size()-2])));
    }
};