public class DividenConquer {
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }

        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    //merge method to merge sorted parts
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei - si + 1];
        int i = si;      //idx for first sorted array
        int j = mid + 1; // idx for second sorted array
        int k = 0;       // idx for temp array

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

        //for leftover element of 1st sorted part
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //for leftover element of 2nd sorted part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //copy temp to original array
        for(k = 0, i = si; k < temp.length; i++, k++){
            arr[i] = temp[k];
        }
    }

    public static void quickSort(int arr[], int si, int ei){
        //Base case
        if(si >= ei){
            return;
        }

        //last element
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);     //left
        quickSort(arr, pIdx+1, ei);     //right
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si - 1;

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];   //pivot = arr[i]
        arr[i] = temp;
        return i;
    }

    //Sorted and Rotated array
    public static int search(int arr[], int target, int si, int ei){
        //Base case
        if(si > ei){
            return -1;
        }

        //Kaam
        int mid = si + (ei - si)/ 2; //si + ei/2

        ////Recursion
        //Case found
        if(arr[mid] == target){
            return mid;
        }

        //mid on L1
        if(arr[si] <= arr[mid]){
            //case a: left
            if(arr[si] <= target && target <= arr[mid]){
                return search(arr, target, si, mid-1);
            }
            //case b: right
            else{
                return search(arr, target, mid+1, ei);
            }
        }
        //mid on L2
        else{
            //case c: right
            if(arr[mid] <= target && target <= arr[ei]){
                return search(arr, target, mid+1, ei);
            }
            //case d: left
            else{
                return search(arr, target, si, mid-1);
            }
        }
    }

public static int search1(int arr[], int tar, int si, int ei){
    while(si <= ei){
        int mid = si + (ei - si)/2;

        //Best case
        if(arr[mid] == tar){
            return mid;
        }

        //on L1
        if(arr[si] <= arr[mid]){
            if(arr[si] <= tar && tar <= arr[mid]){
                ei = mid - 1;
            }
            else{
                si = mid+1;
            }
        }
        //on L2
        else{
            if(arr[mid] <= tar && tar <= arr[ei]){
                si = mid+1;
            }
            else{
                ei = mid-1;
            }
        }
    }
    return -1;
}

    public static void main(String[] args) {
        // int arr[] = {6,3,-8,9,0,5,8,2,-2};
        // mergeSort(arr, 0, arr.length-1);
        // printArr(arr);

        // int arr[] = {6,3,9,8,2,-2, 0};
        // quickSort(arr, 0, arr.length-1);
        // printArr(arr);

        int arr[] = {6,7,8,9,22,2,4,5};
        int target = 9;
        System.out.println("Search Method: "+search(arr, target, 0, arr.length-1));
        System.out.println("Search Method 1: "+search1(arr, target, 0, arr.length-1));
    }
}
