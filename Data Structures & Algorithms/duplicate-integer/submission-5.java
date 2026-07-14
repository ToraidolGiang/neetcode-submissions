class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> checkDuplicate = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            checkDuplicate.put(nums[i], checkDuplicate.getOrDefault(nums[i], 0) + 1);
            if(checkDuplicate.get(nums[i]) > 1){
                return true;
            }
        }
        return false;
    }
}