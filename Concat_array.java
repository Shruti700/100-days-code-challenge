import java.util.Arrays;
class Concat_array{
public static void main(String[]args){
        // 1/100 days of code challenge
        //Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
        //Specifically, ans is the concatenation of two nums arrays.
        //---source: Leetcode
        //Return the array ans.
        int[] nums = new int[]{1,8,6,3,4};
        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
        }

    public static int[] getConcatenation(int[] nums) {
        int l=nums.length;
        int j=0,i=0;
        int[] ans=new int[2*l];
        while(j<2*l){
            ans[j++]=nums[i++];
            if(i==l){
                i=0;
            }
        }
        return ans;
    }
}
