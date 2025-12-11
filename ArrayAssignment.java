public class ArrayAssignment {

    /*
    Question 1:
    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
    */
    public static boolean checkRepetition(int nums[]){
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    /*
    Question 2:
    There is an integer array nums sorted in ascending order (with distinct values). Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+l],	nums[n-l], nums[0], nums[l],	nums[k-l]] (0-indexed). For example, [0, 1 ,2,4,5,6,7] might	rotated	at	pivot	index 3 and become   ,2].
    Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or-I if it is not in nums.
    You must write an algorithm with O(log n) runtime complexity.
    */
    public static int findTarget(int nums[], int target){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    /*
    Question 3: You are given an array prices where prices[i] is the price of a given stock on the i th day.
    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
    */
    public static int stockPrice(int prices[]){
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] > buyPrice){
                int profit = buyPrice - prices[i];
                maxProfit = Math.max(profit, maxProfit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    /*
    Question 4: Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
    */
    public static int TrappedWater(int heights[]){
        int n = heights.length;
        int left_max[] = new int[n];
        left_max[0] = heights[0];

        for(int i = 1; i < n; i++){
            left_max[i] = Math.max(heights[i], left_max[i - 1]);
        }
        int right_max[] = new int [n];
        right_max[0] = heights[n-1];
        for(int i = n -2; i > 0; i--){
            right_max[i] = Math.max(heights[i], right_max[i]);
        }
        
        int trappedWater = 0;
        for(int i = 0; i < n; i++){
            int waterLevel = Math.min(right_max[i], left_max[i]);
            trappedWater += waterLevel - heights[i];
        }
        return trappedWater;
    }

    /*
    Question 5: Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i j, i != k, and j != k, and nums[i] + nums[j] + nums[k] 
    Notice that the solution set must not contain duplicate triplets.
    */
    // public static int tripplets(int nums[]){
    //     return ;
    // }
}
