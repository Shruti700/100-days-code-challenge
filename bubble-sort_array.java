import java.util.Arrays;
class bubblesort {
    public void sorting(int[] nums) {
        int l = nums.length;
        int temp;
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++)
            if(nums[i]>nums[j]){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String args[]){
        int[] nums= {8,6,3,4,1,0,9};
        bubblesort obj = new bubblesort();
        obj.sorting(nums);
    }
}
