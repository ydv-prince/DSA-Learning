public class Array {

    public static int linearSearch(int numbers[], int key){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int getLargestSmallest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        System.out.println(smallest);
        return largest;
    }

    public static void reverse(int numbers[]){
        int first = 0, last = numbers.length-1;
        while(first < last){
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }
    }

    public static void printPairs(int numbers[]){
        int tp = 0;
            for(int i = 0; i < numbers.length; i++){
                int curr = numbers[i];
                for(int j = i+1; j < numbers.length; j++){
                    System.out.print("("+curr+","+numbers[j]+ ") ");
                    tp++;
                }
                System.out.println();
            }
            System.out.print("Total pairs:"+ tp);
        }

    public static void printSubArrays(int numbers[]){
        int ts = 0;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    System.out.print(numbers[k]+ " ");
                    sum += numbers[k];
                }
                ts++;
                System.out.print("  Sum: "+ sum);
                System.out.println();
            }
        }
        System.out.print("Total subarray: "+ ts);
    }

    //Brute Force
    public static void Max_Subarray_Sum(int nums[]){
        int max_sum = Integer.MIN_VALUE;
        int curr_sum;
        for(int i = 0; i < nums.length; i++){
            curr_sum = 0;
            for(int j = i; j < nums.length; j++){
                for(int k = i; k <= j; k++){
                    curr_sum += nums[k];
                }
                System.out.println(curr_sum);
                if(curr_sum > max_sum){
                        max_sum = curr_sum;
                    }
            }
        }
        System.out.println("Maximum Sum: "+ max_sum);
    }

    //Prefix Sum
    public static void Prefix_Subarray_Sum(int nums[]){
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];
        //Prefix Array
        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                curr_sum = i == 0 ? prefix[j] : prefix[j] - nums[i];
            }
            if(max_sum < curr_sum){
                max_sum = curr_sum;
            }
        }
        System.out.println("Max Sum: "+ max_sum);
    }

    //Kadane's Algorithm - Max Subarray Sum
    public static void Kadanes(int numbers[]){
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            curr_sum += numbers[i];
            if(curr_sum == 0){
                curr_sum = 0;
            }
            max_sum = Math.max(curr_sum, max_sum);
            // if(max_sum < curr_sum){
            //     max_sum = curr_sum;
            // }
        System.out.println("Current Sum: "+ curr_sum);
        }
        System.out.print("Max Sum: "+max_sum);
    }

    //Trapping Rain Water Problem
    public static int TrappedRainwater(int height[]){
        int n = height.length;
        //Calculate left max boundary - array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        //Calculate right max boundary - array
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        int trappedwater = 0;
        //loop
        for(int i = 0; i < n; i++){
            //waterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftmax[i], rightmax[i]);

            //trappedwater = waterLevel - height[i]
            trappedwater += waterLevel - height[i];
        }
        return trappedwater;
    }

    //Buy and sell stocks
    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }

    //========================Main Method========================
    public static void main(String[] args) {
        // int marks[] = new int[45];
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[44]);

        // int numbers[] = {1,4,5,87,25,66,105,34,32,102,15};
        // int key = 87;
        // int index = linearSearch(numbers, key);
        // if(index == -1){
        //     System.out.println("NOT FOUND");
        // }else{
        //     System.out.println("Key found at index: "+index);
        // }

        //System.out.print(getLargestSmallest(numbers));

        //int numbers[] = {1,2,3,4,-2,-7,0,1};

        // System.out.print("Original array: ");
        // for(int i = 0; i <= numbers.length-1; i++){
        //     System.out.print(numbers[i] + " ");
        // }
        // System.out.println();
        // reverse(numbers);
        // System.out.print("Reversed array: ");
        // for(int i = 0; i <= numbers.length-1; i++){
        //     System.out.print(numbers[i] + " ");
        // }

        //printPairs(numbers);

        //printSubArrays(numbers);

        // Prefix_Subarray_Sum(numbers);

        //Kadanes(numbers);

        // int height[] = {4, 2, 0, 6, 3, 2, 5};
        // System.out.println("Trapped Water: "+TrappedRainwater(height));

        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Stock Profit: "+buyAndSellStocks(prices));

        // for(int i = 1; i <= 108; i++){
        //     System.out.print("जय मां भवानी 🙏🚩");
        // }
    }
}
