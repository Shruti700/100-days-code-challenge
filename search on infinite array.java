// Brute-force method
public int search(int[] arr,int target){
        int i=0;
        while(arr[i]!=target){
            i++;
        }
        return i;
    }

//-------------------------------------------------------------------------------------------------------------------------------------------------

//Binary-search method
static int findrange(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int nstart = end + 1;
            end = end + (end - start + 1) * 2;
            start = nstart;
        }
        return binarysearch(arr, target, start, end);
    }

    public static int binarysearch(int[] arr, int target, int start, int stop) {
        int element = 0;
        
        while (start <= stop) {

            element = start + (stop - start) / 2;
        
                if (target < arr[element]) {
                    stop = element - 1;
                } else if (target > arr[element])
                    start = element + 1;
                else break;
        }
                if(start>stop){
                    return -1;
                } 
                else return element;
    }
