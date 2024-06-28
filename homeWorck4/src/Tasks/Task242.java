package Tasks;

public class Task242 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 4, -5, 9, -4, -9, -12, 1};
        //  0  1  2  3   4  5   6   7   8   9
        int m = 150;
        int sum = 1;
        for (int i = 0; i < nums.length; i++) {
            if (m % nums[i] == 0){
                sum*=nums[i];
            }
        }
        System.out.println("m tvin bazmapatik tareri artadryal " + sum);
    }
}
