package Tasks;

public class Task215 {
    public static void main(String[] args) {

        int[] nums = {2, 3, 5, 4, -5, 9, -4, -9, -12, 1};
        double sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];
            }
        }

        System.out.println("zuyg index unecox tarerui gumar " + sum);

    }
}
