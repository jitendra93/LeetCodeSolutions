public class MergeSort {


    public static void main(String[] args) {
        int[] arr = {100, 1000, 10000, 10, 1, 1000000};
        int[] res = new int[9];
        UtilKt.prettyPrint(arr);

        mergeSort(arr, res, 0, arr.length - 1);
        UtilKt.prettyPrint(arr);
    }

    public static void mergeSort(int[] arr, int[] result, int low, int high) {
        if (low == high) {
            return;
        }
        int mid = (high + low) / 2;
        mergeSort(arr, result, low, mid);
        mergeSort(arr, result, mid + 1, high);
        merge(arr, result, low, mid, high);
    }

    private static void merge(int[] arr, int[] result, int low, int mid, int high) {
        int k = low;
        int i = low;
        int j = mid + 1;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                result[k++] = arr[i++];
            } else {
                result[k++] = arr[j++];
            }
        }
        //fill the rest
        while (i <= mid) {
            result[k++] = arr[i++];
        }
        while (j <= high) {
            result[k++] = arr[j++];
        }
        for (i = low; i <= high; i++) {
            arr[i] = result[i];
        }
        UtilKt.prettyPrint(arr);
    }
}


