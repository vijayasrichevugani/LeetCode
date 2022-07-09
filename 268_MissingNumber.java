class Solution {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int sum_of_numbers = (l*(l+1))/2;
        int curr_sum=0;
        for(int i=0;i<nums.length;i++){
            curr_sum += nums[i];
        }
        
        return sum_of_numbers-curr_sum;
    }
}
