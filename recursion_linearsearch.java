import java.util.ArrayList;
/**
 * recursion_linearsearch
 */
public class recursion_linearsearch {
    public static void main(String[] args) {
        int[] ar={5,2,6,1,33,6,96};
        int target=6;
        System.out.println(search(ar,target,0));
        multiplesearch(ar,target,0);
        System.out.print(list);
    }
    static int search(int[] arr,int t,int i){
        if(arr[i]==t){
            return i;}
        else if(i==arr.length-1){
            return -1;}
        else { 
            return search(arr,t,i+1);}
    }
    static ArrayList<Integer> list=new ArrayList<>();
    static void multiplesearch(int[] arr,int t,int i){
        if(arr[i]==t){
            list.add(i);
        }
        else if(i==arr.length-1){
            return;
        } 
        multiplesearch(arr,t,i+1);        
    }
}