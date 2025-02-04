class Solution {
    public int maxArea(int[] height) {
    int vol = 0;
    int l = 0;
    int r = height.length - 1;
    int res = 0;
    while(l<r){
        int temp = Math.min(height[l],height[r]);
        int area = temp * (r - l);
        res = Math.max(res,area);
        if(height[l] < height[r])
        {
        l +=1;
        }
        else{
        r -=1;
        }
    } 
     return res;   
    }
}