
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        TwoSum Test = new TwoSum();
        int[] nums1 = new int[]{2,7,11,15};
        int target1 = 9;
        System.out.println("Test 1: " + Arrays.toString(Test.twoSum(nums1,target1)));

        int[] nums2 = new int[]{3,2,4};
        int target2 = 6;
        System.out.println("Test 2: " + Arrays.toString(Test.twoSum(nums2,target2)));

        int[] nums3 = new int[]{2,5,5,15};
        int target3 = 10;
        System.out.println("Test 3: " + Arrays.toString(Test.twoSum(nums3,target3)));


    }
}