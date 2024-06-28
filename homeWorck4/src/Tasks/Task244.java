package Tasks;

public class Task244 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 4, -5, 9, -4, 7, -12, 1};
        //  0  1  2  3   4  5   6   7   8   9
        int sum = 1;
        for (int i = 0; i < nums.length; i++) {
            if ( nums[i] % 5 == 2){
                sum*=nums[i];
            }
        }
        System.out.println("nums[i] % 5 == 2 => " + sum);
    }
}
