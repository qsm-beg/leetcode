import java.util.ArrayList;
import java.util.List;

class Solution {
    public void moveZeroes(int[] nums) {
        int leftPointer = 0;
        int rightPointer = 1;

        while (leftPointer < nums.length && nums.length != 1) {

            var left = nums[leftPointer];
            var right = nums[rightPointer];

            if (left != 0) {
                leftPointer++;
                rightPointer = leftPointer;
                continue;
            }

            if(right !=0){
                nums[leftPointer] = nums[rightPointer];
                nums[rightPointer] = 0;
                leftPointer++;
                rightPointer =leftPointer;
                continue;
            }else if(rightPointer +1 < nums.length){
                rightPointer++;
                continue;
            }

            if(
                    ( (rightPointer +1   == nums.length) )
            )
                break;



}
}
}