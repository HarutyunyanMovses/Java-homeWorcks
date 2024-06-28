package Tasks;

public class Task219 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 4, -5, 9, -4, -9, -12, 1};
        //  0  1  2  3   4  5   6   7   8   9
        int count1 = 0; // drakan
        int count2 = 0; // bacasakan


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                count1++;
            }else {
                count2++;
            }
        }
        System.out.println("drakan " + count1 + " bacasakan " + count2);
    }
}
