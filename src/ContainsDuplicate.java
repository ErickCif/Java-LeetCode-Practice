import java.util.Arrays;

public class ContainsDuplicate {
    /*
        Given an integer array nums, return true if any value appears at least twice in the array, and return false if
        every element is distinct.
     */
    public static void main(String[] args){
        /*
        Input: nums = [1,2,3,1]
        Output: true
         */
        int[] nums = {1,2,3,1};
        boolean output = ContainDup(nums);
    }

    public static boolean ContainDup(int[] nums){
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
