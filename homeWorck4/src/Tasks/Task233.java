package Tasks;

public class Task233 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 4, -5, 9, -4, -9, -12, 1};
        //  0  1  2  3   4  5   6   7   8   9
        int sum = 0;
        int rewrite = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
              sum += nums[i];
              rewrite*=nums[i];
            }
        }
        System.out.println("zuyg elementneri gumar " + sum + " ev artadryal " + rewrite);
    }
}
