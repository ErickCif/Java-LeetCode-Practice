public class RunningSumOfOneDArray {
    // Given an array nums, we define a running sum of an array as
    // runningSum[i] = sum(nums[0]...nums[i]).

    // Return the running sum of nums.
    public static void main(String[] args) {
        // Input: nums = [1,2,3,4]
        // Output: [1,3,6,10]
        // Explanation: Running sum is obtained as follows:
        // [1, 1+2, 1+2+3, 1+2+3+4].

        int[] nums = {1,2,3,4};
        int[] output = runSum(nums);

        for(int num: output){
            System.out.println(num);
        }
    }

    public static int[] runSum(int[] nums){
        int[] output = new int[nums.length];
        int tempSum = 0;

        for(int i = 0; i < nums.length; i++){
            tempSum += nums[i];
            output[i] = tempSum;
        }

        return output;
    }
}