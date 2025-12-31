public class RemoveDuplicate {
//26. Remove Duplicates from Sorted Array
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int write = 1;
        for(int read = 1; read < nums.length; read++){
            if(nums[read] != nums[read-1]){
                nums[write] = nums[read];
                write++;
            }
        }
        return write;
    }
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4,5,5,7,7,8,9,9};
        System.out.println(removeDuplicates(arr));
    }
}
