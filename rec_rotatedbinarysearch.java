/**
 * rec_rotatedbinarysearch
 */
public class rec_rotatedbinarysearch {

    public static void main(String[] args) {
        int[] arr={6,7,1,2,3,4,5};
        int target=5;
        System.out.println(binsearch(arr,target,0,arr.length-1));
    }
    static int binsearch(int[] arr,int t,int start,int end){
        int mid=start+(end-start)/2;
        if(start>end) return -1;
        if(t==arr[mid]) return mid;
        else if(arr[start]<arr[mid]){
            if(t<=arr[mid] && t>=arr[start]){
               return binsearch(arr,t,start,mid-1);
              }
            else return binsearch(arr,t,mid+1,end);
        }
        else {
            if(t>=arr[mid] && t<=arr[end]){
                return binsearch(arr,t,mid+1,end);
               }
            else return binsearch(arr,t,start,mid-1);
        }
    }
}
