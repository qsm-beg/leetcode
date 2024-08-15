import java.util.ArrayList;
import java.util.List;

class moveZeroes {
    public void moveZeroes(int[] nums) {
        List<Integer> niceNumbers = new ArrayList<>();

        for (var number : nums) {
            if (number != 0) {
                niceNumbers.add(number);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < niceNumbers.size()) {
                nums[i] = niceNumbers.get(i);
                continue;
            }
            nums[i] = 0;
        }
    }
}