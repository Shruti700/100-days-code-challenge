class recursion {
 public static void main(String[] args) {
        System.out.println(factorial(3));
    }
    public static int factorial(int n){
        if(n==0 ||n==1){
            return 1;
        }
        int ans=n*factorial(n-1);
        return ans;
    }
}
