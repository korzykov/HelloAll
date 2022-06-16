package ArraysAndLoops_2;

public class TestContinue {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 12, 9};
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 10)
                continue;
            System.out.println(nums[i]);
        }

    }
}
