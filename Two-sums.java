//1.Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=nums.length;
        int[] ans={-1,-1};
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
                if((nums[i]+nums[j])==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        return ans;
    }
}

