import java.lang.Math;
public class radix_sort {
    public static void main(String[] args){
        int[] arr={14,25,9,5,1,20,54,6,33,49,23};
        rsort(arr);
        for(int i:arr){
            System.out.print(i+",");
        }
    }
    public static void rsort(int[] a){
        int max=maximum(a);
        //num of digits in max
        int X=0;
        while(max>0){
            X++;
            max/=10;
        }
        //int[] ans=new int[a.length];

        System.out.println("no of digits "+X);
        for(int i=1;i<=X;i++){
            int q=(int)Math.pow(10,i-1);
            csort(a,q);
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
    public static void csort(int[] a,int place){
        int[] output=new int[a.length];
        int[] count=new int[10];
        for(int i=0;i<count.length;++i){
            count[i]=0;
        }
        for(int j=0;j<a.length;j++){
            count[(a[j]/place)%10]+=1;
        }
        for(int k=1;k<count.length;k++){
            count[k]+=count[k-1];
        }
        for(int l=a.length-1;l>=0;l--){
            int temp=count[(a[l]/place)%10];
            output[temp-1]=a[l];
            count[(a[l]/place)%10]--;
        }
        for(int i=0;i<a.length;i++){
            a[i]=output[i];
        }
    }
}
