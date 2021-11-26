class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int max=0;
        int area=0;
        while(start<end){
        area=Math.min(height[start],height[end])*(end-start);
           max=Math.max(max,area) ;
               if(height[start]>height[end]) end-=1;
            else start+=1;
            
        }
        return max;
    }
}
