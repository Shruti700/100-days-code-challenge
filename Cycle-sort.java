
import java.util.Arrays;
class Solution {
    public int[] cyclesort(int[] arr) {
        int l = arr.length;
        int temp=0;
        int i=0;
       while(i<l){
           if((arr[i]-1)!=i){
            temp=arr[i];
            arr[i]=arr[temp-1];
            arr[temp-1]=temp;
           }
           else i++;
           System.out.println(Arrays.toString(arr));
       }
        
        return arr;
    }
    
    public static void main(String[] args){
        int[] arr={7,1,6,5,2,3,8,4};
        Solution obj=new Solution();
        int[] a= obj.cyclesort(arr);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
