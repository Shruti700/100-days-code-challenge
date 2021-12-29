import java.util.ArrayList;

/**
 * recusion_arrlist
 */
public class recusion_arrlist {

    public static void main(String[] args) {
        int[] arr={4,6,5,7,10,5};
        int t= 5;
        System.out.println(rec(arr,t,0));
    }
    public static ArrayList rec(int[] arr,int t,int i){
        ArrayList<Integer> a=new ArrayList<Integer>();
        if(arr[i]==t){
            a.add(i);
        }
        if (i==arr.length-1){
            return a;
        }
        ArrayList<Integer> ansfrombelow=rec(arr,t,i+1);
        a.addAll(ansfrombelow);
        return a;
    }
}