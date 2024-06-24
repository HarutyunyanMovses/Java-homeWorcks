public class Xndir37 {
    public static void main(String[] args) {
        double[] nums = {2,4,6,11,8,10};
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
                System.out.print(" " + nums[i]);
            }
            double d = nums[1]-nums[0];
            for (int i = 2; i < nums.length ; i++) {
                if (!(nums[i]-nums[i-1]==d)){
                    bool = false;
                    break;
                }
            }
            System.out.println(" => "+bool);
        }
    }
}
