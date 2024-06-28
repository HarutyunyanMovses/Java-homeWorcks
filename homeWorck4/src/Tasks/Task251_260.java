package Tasks;

public class Task251_260 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 4, -5, 9, -4, 7, -12, 1};
        //  0  1  2  3   4  5   6   7   8   9
        int max = nums[0];
        int min = nums[0];
        int sumMax = 0;
        int sumMin = 0;
        int lastMaxI = 0;
        int lastMinI = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                sumMax = nums[i] + i;
                lastMaxI = i;
            }
            if (nums[i] < min) {
                min = nums[i];
                sumMin = nums[i] + i;
                lastMinI = i;
            }
        }
        int firstMaxsI = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                firstMaxsI = i;
                break;
            }
        }


        System.out.println("251 gtnel mecaguyn arjeq => " + max);
        System.out.println("252 gtnel poqraguyn tar => " + min);
        System.out.println("253 mecaguyn ev poqraguyn tareri gumar => " + (max + min));
        System.out.println("254 mecaguyn ev poqraguyn tareri artadryal => " + max * min);
        System.out.println("255 mecaguyn tari ev ir indexi gumar => " + sumMax);
        System.out.println("256 poqraguyn tari ev ir indexi gumar" + sumMin);
        System.out.println("257 gtnel arajin mecaguyn tari index => " + firstMaxsI);
        System.out.println("258 verejin mecaguyn tari index => " + lastMaxI);
        System.out.println("260 verjin poqraguyn tari index => " + lastMinI);

    }
}
