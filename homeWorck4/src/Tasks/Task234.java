package Tasks;

public class Task234 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 4, -5, 9, -4, -9, -12, 1};
        //  0  1  2  3   4  5   6   7   8   9
        double sum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 !=0){
                sum = sum + nums[i];
                count++;
            }
        }

        System.out.println("kent tveri mijin tvabanakan = " + sum + " / " + count + " = " + sum / count);


    }
}
