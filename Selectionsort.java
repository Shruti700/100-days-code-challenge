class Solution {
    public int[] selectionsort(int[] arr) {
        int l = arr.length;
       
        
        int temp=0,j=0;
        //arr[0]=min;
        for(int i=0;i<l;i++){
            int ans=i;
            for(int k=i+1;k<l;k++){
                
                if(arr[k]<arr[ans]){ 
                     ans=k;}
            }
            temp=arr[i];
            arr[i]=arr[ans];
            arr[ans]=temp;
            //j++;
            }
        
        return arr;
    }
    
    public static void main(String[] args){
        int[] arr={17,18,5,4,6,1};
        Solution obj=new Solution();
        int[] a= obj.selectionsort(arr);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
