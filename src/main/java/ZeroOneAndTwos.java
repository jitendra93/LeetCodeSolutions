//Array consist of only 0's, 1's and 2's. Write an
// algorithm to sort  this array in O(n) time complexity and O(1)
// Space complexity with only one traversal
public class ZeroOneAndTwos {

    public static void main (String[] args) {

        int[] arr = new int[]{0,2,1,2,2,2,0,0,0,0,2,1,1,1};
        UtilKt.prettyPrint(arr);
        sort(arr);
        UtilKt.prettyPrint(arr);
    }

    static void sort(int [] array){
        int low =0,mid = 0;
        int high = array.length -1;

        while (mid <= high){
            if (array[mid] == 0){
                swap(array,low,mid);
                ++low; ++mid;
            }
            else if(array[mid] == 2){
                swap(array,mid,high);
                --high;
            }
            else ++mid;
        }
    }

    static void swap(int[] array, int first, int second){

        array[first] =  array[first] + array[second];
        array[second] = array[first] - array[second];
        array[first] =  array[first] - array[second];
    }
}
