package Tasks;

public class Task237 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 4, -5, 9, -4, -9, -12, 1};
        //  0  1  2  3   4  5   6   7   8   9
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                count++;
            }

        }
        System.out.println("0 arjeq unecox tareri qanak " + count);
    }
}
