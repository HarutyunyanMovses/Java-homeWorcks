import java.util.Arrays;

public class Xdir39_40 {
    public static void main(String[] args) {
        double[] arr = {2, 4, 6, 11, 8, 10};
        double k;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
            }
        }
        System.out.println("xndir 39: achox hertakanutyun");
        System.out.println(Arrays.toString(arr));
        ////40
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
            }
        }
        System.out.println("xndir 40: nvazox hetakanutyun");
        System.out.println(Arrays.toString(arr));
    }
}
