class Solution {
    public int[] findErrorNums(int[] nums) {
        int l=nums.length;
        int i=0;
        while(i<l){
            int correctindex=nums[i]-1;
            if(nums[i]!=nums[correctindex]){
                int temp=nums[i];
                nums[i]=nums[correctindex];
                nums[correctindex]=temp;
            }
            else i++;
        }
        int[] ans=new int[2];
        int repeat=0;
        int skipped=0;
       for (int j=0;j<nums.length;j++){
           if(nums[j]!=j+1){
               return new int[] {nums[j],j+1};
           }
           
       }
        return new int[] {-1,-1};
    }
}
