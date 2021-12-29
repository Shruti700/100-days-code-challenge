class recursion_checksorted_array {
    static boolean chkarr(int[] arr, int i){
        if((i+1)==arr.length){
            return true;
        }
        return (arr[i]>arr[i+1] && chkarr(arr,i+1));
    }
    public static void main(String[] args) {
        int[] ar={1,3,4,5,9,10};
        //System.out.println(checksort(ar,0));
        System.out.print(chkarr(ar,0));
    }
}
