/**
 * rec_insersionsort
 */
public class rec_insersionsort {

    public static void main(String[] args) {
        int[] arr={10,6,4,5,2,3,-2,-1};
        rec(arr,1);
        for(int i:arr){
        System.out.print(i+",");}
    }//start_index<0 ||
    public static void rec(int[] arr,int i){
       // int start_index=i-1; && j>1
        
        int j=i;
        while(j>0){
            if(arr[j]<arr[j-1]){
            int t=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=t;}
            j--;
        }        
        if (i==arr.length-1) return; 
        rec(arr,i+1);
    }
}