public class binary_search {
    static int binary(int[] arr, int target) {
        // checking array if it is in ascending order
        boolean asc_order = arr[0] < arr[1];
        // searching algo
        int start = 0, stop = arr.length, element = 0;
        while (start <= stop) {
            
            element = start + (stop - start) / 2;
            if (asc_order == true) {
                if (target < arr[element]) {
                    stop = element - 1;
                } else if (target > arr[element])
                    start = element + 1;
                else if (target == arr[element])
                    break;
            }
            if (asc_order == false) {
                if (target > arr[element]) {
                    stop = element - 1;
                } else if (target < arr[element])
                    start = element + 1;
                else if (target == arr[element])
                    break;
            }
        }
        if (start > stop)
            return -1;
        else
            return element;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 2, 5, 8, 16, 22, 33, 34, 41, 56, 63, 69, 72, 75 };
        int[] nums2 = { 75, 72, 69, 63, 56, 41, 34, 22, 16, 11, 8, 5, 2, 0 };
        int target = 56;
        System.out.println(binary(nums, target));
        System.out.println(binary(nums2, target));
    }
}
