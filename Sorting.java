public class Sorting {

    public static void BubbleSort(int[] nums){
        System.out.println("Bubble Sort");
        int n = nums.length;
        for(int turn = 0; turn < n - 1; turn++){
            for(int j = 0; j < n - 1 - turn; j++){
                if(nums[j] > nums[j+1]){
                    //Swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static void PrintArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void SelectionSort(int arr[]){
        System.out.println("Selection Sort");
        for(int i = 0; i < arr.length-1; i++){
            int minPos = i;
            for(int j = i+1; j < arr.length; j++){
                //In Descending Order
                //if(arr[minPos] < arr[j]){
                //In Ascending Order
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void InsertionSort(int arr[]){
        System.out.println("Insertion Sort");
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            //For Descending order
            //while(prev >= 0 && arr[prev] < curr){

            //Finding out the correct pos to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            //Insertion
            arr[prev + 1] = curr;
        }
    }

    public static void CountingSort(int arr[]){

        //Find Maximum element
        System.out.println("Counting Sort");
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        //Find Frequency
        int count[] = new int[largest+1];
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }

        //Sorting
        int j = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] number = {6,3,7,10,9,2,0};

        InsertionSort(number);
        BubbleSort(number);
        SelectionSort(number);
        //Arrays.sort(number);
        //Arrays.sort(number, 0,4,Collections.reverseOrder());
        CountingSort(number);
        PrintArr(number);
    }
}
