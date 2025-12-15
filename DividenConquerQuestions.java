public class DividenConquerQuestions {
    // //Using DividenConquer class methods
    // public static void main(String[] args) {
    //     int arr[] = {2,5,4,9,2};
    //     int si = 0;
    //     int ei = arr.length-1;
    //     DividenConquer.mergeSort(arr, si, ei);
    //     DividenConquer.printArr(arr);
    // }

    /*
    Q1. Apply merge sort to sort an array of strings. (Assume that all the characters in all the strings are in lowercase).
    */

    public static void mergeSort(int arr[], int si, int ei){
        //Base case
        if(si >= ei){
            return;
        }

        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei - si +1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        for(k = 0, i = si; k < temp.length; i++, k++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,7,5,0,44,87,-2,12,34,90};
        int si = 0;
        int ei = arr.length-1;
        mergeSort(arr, si, ei);
        DividenConquer.printArr(arr);
    }
}
