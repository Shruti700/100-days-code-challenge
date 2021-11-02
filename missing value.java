//Find the missing value in the array ought to contain numbers in range 0 to n.
//Solution using cycle sorting algorithm.
import java.util.Arrays;
class Cyclesort {
    public int cyclesort(int[] arr) {
        int l = arr.length;
        int temp=0;
        int i=0;
        int ans=0;
       while(i<l){
           if(arr[i]==l){
            i++;
            
           }
           else if((arr[i])!=i){
            temp=arr[i];
            arr[i]=arr[temp];
            arr[temp]=temp;
           }
           else i++;
           System.out.println(Arrays.toString(arr));
       }
       for(int a=0;a<l;a++){
        if(arr[a]!=a){ ans=a;
        break;}
       }
        
        return ans;
    }
    
    public static void main(String[] args){
        int[] arr={7,0,5,2,3,6,4};
        Cyclesort obj=new Cyclesort();
        int a= obj.cyclesort(arr);
        //for(int i=0;i<a.length;i++){
            System.out.print(a);
        }
    
}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------
//for more than one element missing:

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int l= nums.length;
        int i=0;
        int correct=0;
        while(i<l){
            correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,nums[i]-1);
            }
            else i++;
        }
        List<Integer> ans= new ArrayList<>();
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=(k+1)) ans.add(k+1);
        }
        return ans;
    }
    public void swap(int[] arr,int start,int des){
    int temp=arr[start];
        arr[start]= arr[des];
        arr[des]=temp;
        
} 
