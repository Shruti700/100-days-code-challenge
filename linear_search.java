public class linear_search {
    static int searchindex(int[] arr,int target){
        boolean flag=false;
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]==target) { flag=true;break;}
            
        }
        return flag==true?i:-1;
    }
    public static void main(String[] args){
        int[] nums={15,36,44,12,59,20,3,79};
        int t= 36;
        System.out.println(searchindex(nums,t));
    }
    
}
