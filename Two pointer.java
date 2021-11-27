//Container with most area question
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

-----------------------------------------------------------------------------------------
    // Tapping rainwater question
  class Solution {
    public int trap(int[] height) {
      int start=0;
        int end=height.length-1;
        int lmax=0;
        int rmax=0;
        int area=0;
        while(start<end){
            
            
            if(height[start]>=height[end]) { 
                 rmax=Math.max(rmax,height[end]);
               
                area+=rmax-height[end];
                 end-=1;
              }
            else {
                lmax=Math.max(lmax,height[start]);
               
            area+=lmax-height[start];
            start+=1;}
            
        
        }
        return area;  
    }
}
