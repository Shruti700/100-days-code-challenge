//Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
class Solution {
    public int[] replaceElements(int[] arr) {
        int l = arr.length;
        int max=0,j;
        for(int i=0;i<l-1;i++){
            j=i+1;
            max=arr[j];
            while(j<l){
                if(max<arr[j]){
                    max=arr[j];  }
                j++;
            }
                arr[i]=max;
            }
        arr[l-1]=-1;
        return arr;
    }
    public static void main(String[] args){
        int[] arr={17,18,5,4,6,1};
        Solution obj=new Solution();
        int[] a= obj.replaceElements(arr);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
