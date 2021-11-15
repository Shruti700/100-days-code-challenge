class Counting_sort{
    public static void main(String[] args){
        int[] arr= {4,2,2,8,3,3,1};
        int max=maximum(arr);
        int[] count= new int[max+1];
        int[] ans=sort(arr, count);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+",");
        }

    }
    public static int maximum(int[] a){
        int max=a[0];
        for(int x=0;x<a.length;x++){
            if(a[x]>max){
                max=a[x];
            }
        }
        return max;
    }
    public static int[] sort(int[] a,int[] count){
        int[] output=new int[a.length];
        for(int i=0;i<count.length;i++){
            count[i]=0;
        }
        for(int j=0;j<a.length;j++){
            count[a[j]]+=1;
        }
        for(int k=1;k<count.length;k++){
            count[k]+=count[k-1];
        }
        for(int l=0;l<a.length;l++){
            int temp=count[a[l]];
            output[temp-1]=a[l];
            count[a[l]]--;
        }
        return output;
    }
}
