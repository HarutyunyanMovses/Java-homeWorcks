public class Xndir38 {
    public static void main(String[] args) {
        double[] nums = {128, 8, 15, 4,64,32};
        double k  ;
        boolean bool = true;
        if (nums.length > 2) {
            for (int i = 0; i < nums.length ; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] > nums[j]) {
                        k = nums[i];
                        nums[i] = nums[j];
                        nums[j] = k;
                    }
                }
                System.out.print( " "+nums[i]);
            }
            double q = nums[1] / nums[0];
            for (int i = 2; i < nums.length; i++) {
                if (nums[i] / nums[i - 1] != q) {
                    bool = false;
                    break;
                }
            }

            System.out.println(" => "+bool);
        }
    }
}
