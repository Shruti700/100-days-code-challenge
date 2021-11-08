class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
       
        
        int start = 0, stop = arr.length-1, element = 0;
        while (start <= stop) {
            
            element = start + (stop - start) / 2;
         
                if (target < arr[element]) {
                    stop = element - 1;
                } else  start = element + 1;
        }
                
            return arr[start%arr.length];
        
        } 
    
    
