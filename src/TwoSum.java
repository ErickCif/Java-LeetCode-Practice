public class TwoSum {
    /*
    Given an array of integers nums and an integer target, return
    indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution,
    and you may not use the same element twice.

    You can return the answer in any order.
     */

    public static void main(String[] args){
        /*
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
         */
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] output = sumOfTwo(nums, target);

        for(int num: output){
            System.out.println(num);
        }
    }

    public static int[] sumOfTwo(int[] nums, int target){
        int[] output = new int[2];

        for(int i = 0; i < nums.length; i++){
            for(int j = (i + 1); j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    output[0] = i;
                    output[1] = j;
                }
            }
        }

        return output;
    }
}
