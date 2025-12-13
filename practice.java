public class practice {
    // public static void main(String[] args) {
    //     int n = 4;
    //     for(int line = 0; line <= n; line++){
    //         for(int star = 0; star <= line; star++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {
    //     int n = 4;
    //     for(int line = 0; line <= n; line++){
    //         for(int number = 1; number <= line; number++){
    //             System.out.print(number);
    //             number++;
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {
    //     int n = 10;
    //     for(int line = 1; line <= n; line++){
    //         for(int star = 1; star <= n-line+1; star++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void mergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei - si + 1];
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

    public static void quickSort(int arr[], int si, int ei){
        //Base case
        if(si >= ei){
            return;
        }

        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j=si; j < ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[ei] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    //Main method
    public static void main(String[] args) {
        int arr[] = {5,6,7,13,3,9,};
        int si = 0;
        int ei = arr.length-1;
        quickSort(arr, si, ei);
        System.out.print("Quick Sort: ");
        DividenConquer.printArr(arr);
    }
}