package Tasks;

public class Task216 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 4, -5, 9, -4, -9, -12, 1};
        int sum = 1;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0){
                sum*=nums[i];
            }
        }

        System.out.println("zuyg index unecox tareri artadryal " + sum);

    }
}
