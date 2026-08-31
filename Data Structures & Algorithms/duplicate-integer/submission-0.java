class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int left=0; left<nums.length; left++){
            for(int right=left+1; right< nums.length; right++){
                if(nums[left]==nums[right]){
                    return true;
                }
            }
        }
        return false;
        
    }
}