public class reverseno {
    public static void main(String[] args) {
        //reverse(542970);
        System.out.println();
        System.out.println(rev(542970));
        palin(54245);
    }
    static void reverse(int n){
        if (n%10==n){
            System.out.print(n);
            return;
        
        }
        System.out.print(n%10);
        reverse(n/10); 
        

    }
    static int ans=0;
    static int rev(int n){
        ans= (ans*10)+ n%10;
        if(n%10==n){
          return n;
       }
        
        rev(n/10);
        
        return ans;
    }
    static void palin(int a){
        
            System.out.println(a==rev(a));
        
    }
}
