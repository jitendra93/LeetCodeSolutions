//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the
// non-zero elements in O(n) Time complexity and O(1) Space complexity with single traversal allowed

import java.util.HashMap;
import java.util.Map;

public class MoveZeroesToEnd {

    public static void main(String[] args) {

        int[] arr = new int[]{0, 2, 1, 2, 2, 2, 0, 0, 0, 0, 2, 1, 1, 1};
        UtilKt.prettyPrint(arr);
        sort(arr);
        UtilKt.prettyPrint(arr);
    }

    static void sort(int[] array) {
       int low = 0;
       int mid = 0;
       while (mid < array.length){
           if(array[mid] != 0){
               array[low] = array[mid];
               low++;
           }
          mid++;
       }
        for (int j = low; j < array.length; j++) {
            array[j] = 0;
        }
    }

    static void swap(int[] array, int first, int second) {

        array[first] = array[first] + array[second];
        array[second] = array[first] - array[second];
        array[first] = array[first] - array[second];
    }
}
