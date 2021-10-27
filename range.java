class range {
  //day 2/100
  // Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
  //If target is not found in the array, return [-1, -1]
    public int[] searchRange(int[] nums, int target) {
        int l = nums.length;
        int[] ans = {-1,-1};
        int j=0;
        for(int i=0;i<l;i++){
            if(nums[i]==target){
                ans[1]=i;
                j++;
            }
            }
        if(j>0){
                j=j-1;
            }
        ans[0]=ans[1]-j;
        return ans;
        
        }
    }
