public class rucursion_sum {
    public static void main(String[] args) {
        System.out.println(sums(5));
    }
    static int sums(int n){
        if(n==0){
            
            return 0;
        }
        
        //System.out.println(n+sums(n-1));
        return n+sums(n-1);
    }
}
