package Tasks;

public class Task214 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 4, -5, 9, -4, -9, -12, 1};
        double sum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<0){
                sum = sum + nums[i];
                count++;
            }
        }

        System.out.println("bacasakan tveri mijin tvabanakan = " + sum + " / " + count + " = " + sum / count);


    }
}
