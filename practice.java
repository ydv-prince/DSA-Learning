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
}