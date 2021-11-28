class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> map=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }
        return map.size()<nums.length;
    }
}
