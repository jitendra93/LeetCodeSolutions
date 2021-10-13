/**
 * We rotate an ascending order sorted array at some point unknown to user.
 * So for instance, 3 4 5 6 7 might become 55 66 68 1 2 3 4 .
 * Modify binary search algorithm to find an element in the
 * rotated array in O(log n) time and O(1) Space complexity
 *
 *
 * KEY - array when broken in half would have either the left or the right portion sorted
 */

public class RotatedArray {

    public static void main(String[] args) {
        int[] arr = new int[]{55,66,1, 2,3,4};
//        int[] arr = new int[]{5, 6, 10, 12, 14, 15, 17, 88, 89, 3, 4};
        System.out.println(modifiedBinarySearch(arr, 2, 0, arr.length - 1));
    }

    static int modifiedBinarySearch(int[] arr, int value, int start, int end) {
       if(start>end)
           return -1;

       int mid = (start+end)/2;
       if(arr[mid] == value)
           return mid;
       //check if start to mid is sorted
        if(arr[start] <= arr[mid]){
            if(value >= arr[start] && value <= arr[mid]){ //check if in range
                return modifiedBinarySearch(arr,value,start,mid);
            }
            return modifiedBinarySearch(arr,value,mid+1,end);
        }
        //as start to mid is unsorted, it means mid to end is sorted
        if(value >= arr[mid] && value <= arr[end] ){ //check if in range
            return  modifiedBinarySearch(arr,value,mid+1,end);
        }
        return modifiedBinarySearch(arr,value,start,mid-1);

    }

}
