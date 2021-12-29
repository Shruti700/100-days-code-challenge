class rec_patterm {
    public static void main(String[] args) {
        pattern(4,0);
    }
    public static void pattern(int r,int c){
        if(r==0){
            return;
        }
        else if (c==r){
            System.out.println();
            pattern(r-1,0);
            System.out.println();
        }
        else {
        System.out.print("*"+" ");
        pattern(r,c+1);
        System.out.print("*"+" ");}
    }
}
