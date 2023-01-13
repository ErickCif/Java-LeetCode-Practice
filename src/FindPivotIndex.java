public class FindPivotIndex {
    /*
        Given an array of integers nums, calculate the pivot index of this array.

        The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the
        sum of all the numbers strictly to the index's right.

        If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left.
        This also applies to the right edge of the array.

        Return the leftmost pivot index. If no such index exists, return -1.
     */
    public static void main(String[] args){
        /*
        Input: nums = [1,7,3,6,5,6]
        Output: 3
        Explanation:
        The pivot index is 3.
        Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
        Right sum = nums[4] + nums[5] = 5 + 6 = 11
        */

        int[] nums = {1,7,3,6,5,6};
        int output = pivIndex(nums);
        System.out.println(output);
    }

    public static int pivIndex(int[] nums){
        int index = -1;

        // Two edge cases:
        // ( 1.) The index is on the left edge, sum of the right indexes is 0
        // ( 2.) The index is on the right edge, sum of the left indexes is 0


        for(int i = 0; i < nums.length; i++){
            int leftSum = 0;
            int rightSum = 0;
            int edgeCheck = 0;

            // System.out.println("+++++++++++++++++");
            // System.out.println("About to start a loop, current index is: " + i + ". In nums the number is: " + nums[i]);

            if(i == 0){
                for(int j = 1; j < nums.length; j++){
                    edgeCheck += nums[j];
                }
                if(edgeCheck == 0){
                    // System.out.println("About to return 0 from the left if statement");
                    return 0;
                }else{
                    continue;
                }
            }

            // Left side
            for(int j = 0; j < i; j++){
                leftSum += nums[j];
                // System.out.println("Just added: " + nums[j] + " from nums, leftSum is: " + leftSum);
            }
            // Right side
            for(int j = i; j < nums.length; j++){
                rightSum += nums[j];
                // System.out.println("Just added: " + nums[j] + " from nums, rightSum is: " + rightSum);
            }

            rightSum -= nums[i];

            if(leftSum == rightSum){
                // System.out.println("Left and Right sum are equal, about to return i.");
                return i;
            }

            if(i == (nums.length - 1)){
                for(int j = 0; j < i; j++){
                    edgeCheck += nums[j];
                }
                if(edgeCheck == 0){
                    // System.out.println("About to return 0 from the right if statement");
                    return 0;
                }else{
                    continue;
                }
            }

        }

        return index;
    }
}
