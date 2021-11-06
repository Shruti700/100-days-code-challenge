class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans=new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(count(nums,nums[i])==1){
                ans[k++]=nums[i];
            }
            if (ans.length>2){ break;}
        }
        return ans;
    }
    public int count(int[] nums,int target){
        int c=0;
      for(int j=0;j<nums.length;j++){
          if(nums[j]==target){
              c++;
          }
      }
        return c;
    }
}
