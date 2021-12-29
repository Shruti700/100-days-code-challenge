public class rec_bubblesort {
    public static void main(String[] args) {
        int ar[] = {8,6,2,7,10,3,9,0};
        int l=ar.length;
        sort(ar,l-1,0);
        for(int x:ar){
        System.out.print(x+",");}
    }
    static void sort(int[] arr,int r,int c){
        if(r==0){
            return;
        }
        else if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            sort(arr,r,c+1);
        }
        else{ sort(arr,r-1,0);}
    }
}
