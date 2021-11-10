/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
// For a mountain array searching, first we divide the array in two parts, one in ascending other in descending order, 
//then searching for element first in asc. then in other to find the minimum index.  
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int i=0,ans=-1;
       int peak_index=find_peak(mountainArr);
        int t=find_index(target,mountainArr,0,peak_index);
        int t2=find_index(target,mountainArr,peak_index+1,mountainArr.length()-1);
        if(t>-1){
            ans=t;
        }
        else if(t2>-1){
            ans=t2;
        }
        
        return ans;
    }
public int find_peak( MountainArray mountainArr) {
         int start=0, stop=mountainArr.length()-1;
  while(start!=stop){
    int index= start+(stop-start)/2;
    if(mountainArr.get(index)>mountainArr.get(index+1)){
      stop=index;}
    else if(mountainArr.get(index)<mountainArr.get(index+1)){
      start=index+1;}
    else{
      break;}}
    return start;
    }
public static int find_index(int target, MountainArray mountainArr,int start,int stop) {
           // searching algo
        int element = 0;
     boolean asc_order = mountainArr.get(start) < mountainArr.get(stop);
        while (start <= stop) {
            
            element = start + (stop - start) / 2;
            if (asc_order == true) {
                if (target < mountainArr.get(element)) {
                    stop = element - 1;
                } else if (target >mountainArr.get(element))
                    start = element + 1;
                else if (target == mountainArr.get(element))
                    break;
            }
            if (asc_order == false) {
                if (target > mountainArr.get(element)) {
                    stop = element - 1;
                } else if (target < mountainArr.get(element))
                    start = element + 1;
                else if (target == mountainArr.get(element))
                    break;
            }
        }
        if (start > stop)
            return -1;
        else
            return element;
    }
}
