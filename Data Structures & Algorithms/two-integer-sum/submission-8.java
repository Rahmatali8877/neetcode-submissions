class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer,Integer> h = new HashMap();
         for(int a=0; a<nums.length; a++){
            int compliment=target - nums[a];
            if(h.containsKey(compliment)){
                return new int[]{h.get(compliment),a};
            }
            h.put(nums[a],a);
         }
         return new int[]{};
         
    }
   
}
