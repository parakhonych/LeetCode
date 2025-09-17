import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] nums = {-1,0,4,4};

        RemoveDuplicate rD = new RemoveDuplicate();

        int k = rD.removeDuplicates(nums);

        System.out.println("k = " + k);
        System.out.println("nums = " + Arrays.toString(nums));
    }
}
