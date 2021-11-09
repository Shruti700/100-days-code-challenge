// Find peak index in a mountain array 
// method 1:
 public int peakIndexInMountainArray(int[] arr) {
        int i=0;
        for(i=1;i<arr.length-1;i++){
            if(arr[i+1]<arr[i] ){
                break;
            }
        }
        return i;
    }
//method 2: Binary Search
public int peakIndexInMountainArray(int[] arr) {
         int start=0, stop=arr.length;
  while(start!=stop){
    int element= start+(stop-start)/2;
    if(arr[element]>arr[element+1]){
      stop=element;}
    else if(arr[element]<arr[element+1]){
      start=element+1;}
    else{
      break;}}
    return start;
    }
