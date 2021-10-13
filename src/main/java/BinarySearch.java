public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr,4,0,arr.length));
    }

    static int binarySearch(int [] arr,int key, int low, int high){
        if(low>high){
            return -1;
        }
        int mid = (low+high) / 2;
        if(arr[mid] == key){
            return mid;
        }
        if(key < arr[mid]){ // for ascending arr check key less than mid value
            return binarySearch(arr,key,low,mid-1);
        }else return binarySearch(arr,key,mid+1,high);
    }
}
