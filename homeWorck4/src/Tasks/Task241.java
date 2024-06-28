package Tasks;

public class Task241 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 4, -5, 9, -4, -9, -12, 1};
        //  0  1  2  3   4  5   6   7   8   9
        int k = 150;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (k % nums[i] == 0){
                sum+=nums[i];
            }
        }
        System.out.println("K tvin bazmapatik tareri gumary " + sum);
    }
}
