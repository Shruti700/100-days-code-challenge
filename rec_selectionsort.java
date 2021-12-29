public class rec_selectionsort {
    public static void main(String[] args) {
        int ar[] = {8,6,2,7,10,3,9,0};
        int l=ar.length;
        sort(ar,l-1);
        for(int x:ar){
        System.out.print(x+",");}
    }
    static void sort(int[] arr,int r){
        if(r==0){return;}
        int max=0;
        for(int i=0;i<=r;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        //swap
        int t=arr[r];
        arr[r]=arr[max];
        arr[max]=t;

        sort(arr,r-1);
    }
}
