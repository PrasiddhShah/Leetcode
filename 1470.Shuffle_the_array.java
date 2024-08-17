class Solution {
    public int[] shuffle(int[] nums, int n) {
        int j=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<n;i++){
            arr[j]=nums[i];
            arr[++j]=nums[i+n];
            j++;
        }
           return arr;

    }
}
