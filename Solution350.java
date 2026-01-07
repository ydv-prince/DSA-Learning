//350. Intersection of Two Arrays II
import java.util.*;
public class Solution350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0, j=0;
        List<Integer> temp = new ArrayList<>();

        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                temp.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int result[] = new int[temp.size()];
        for(int k=0; k<temp.size(); k++){
            result[k] = temp.get(k);
        }

        return result;
    }
    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums1[] = {4,9,5};
        int nums2[] = {9,4,9,8,4};

        printArr(intersect(nums1, nums2));
    }
}