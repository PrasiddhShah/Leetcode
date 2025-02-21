class Solution {
    public int[] productExceptSelf(int[] nums) {
     int[] arr = new int[nums.length];
     Arrays.fill(arr, 1);
     int pre = 1;
     int pos = 1;
     

     for(int i = 1; i < arr.length; i++ ){
        pre *= nums[i-1];
        arr[i] *= pre;
        System.out.println(arr[i]);
        
     }
     System.out.println("--------");
     for(int j = (arr.length - 1); j > 0; j--){
        pos *= nums[j];
        arr[j-1] *= pos;
        System.out.println(arr[j]); 
     }
     
     return arr;
    }
}