public class SortingAssignment {

    //Bubble Sort in Descending order
    public static void DescBubble(int[] nums){
        System.out.println("Descending Bubble Sort");
        int n = nums.length;
        for(int turn = 0; turn < n - 1; turn++){
            for(int j = 0; j < n - 1 - turn; j++){
                if(nums[j] < nums[j+1]){
                    //Swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    //Selection Sort in Descending order
    public static void DescSelection(int[] arr){
        System.out.println("Descending Selection Sort");
        for(int i = 0; i < arr.length-1; i++){
            int minPos = i;
            for(int j = i+1; j < arr.length; j++){
                //In Descending Order
                if(arr[minPos] < arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    //Insertion Sort in Descending order
    public static void DescInsertion(int[] arr){
         System.out.println("Descending Insertion Sort");
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            //Descending order
            while(prev >= 0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            //Insertion
            arr[prev + 1] = curr;
        }
    }

    //Counting Sort in Descending order
    public static void DescCounting(int[] arr){
        System.out.println("Descending Counting Sort");
        //Find Maximum element
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
        for(int i = count.length-1; i >= 0; i--){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        //DescBubble(arr);
        //DescSelection(arr);
        //DescInsertion(arr);
        DescCounting(arr);
        Sorting.PrintArr(arr);
    }
}