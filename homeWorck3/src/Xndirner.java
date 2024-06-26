public class Xndirner {
    public static void main(String[] args) {
        System.out.println("revers arr elements");
        int[] arr = {123, 22, 4568, 125, 564}; // => {321 , 22 , 8654 , 521 , 465}
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            int num = 0;
            while (number > 0) {
                num = num * 10 + number % 10;
                number /= 10;
            }
            result[i] = num;
        }
        for (int item : result) System.out.print(" " + item);
        System.out.println();
        /////////////////////////////////////////////////
        // task1
        System.out.print("task 1: ");
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) nums[i] = 2;
        for (int num : nums) System.out.print(" " + num);
        System.out.println();
        /////////////////////////////////////////////////
        // task2
        System.out.print("task 2: ");
        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1 + i;
        }
        for (int k : arr1) System.out.print(" " + k);
        System.out.println();
        ////////////////////////////////////////////////
        //task3
        System.out.print("task 3: ");
        int[] odds = new int[20];
        for (int i = -20, j = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                odds[j++] = i;
            }
        }
        for (int odd : odds) System.out.print(" " + odd);
        System.out.println();
        /////////////////////////////////////////////////
        // task 4
        System.out.print("task 4: ");
        int[] arr4 = {1698, 525, 12, 5, 85, 90, 63};
        for (int item : arr4) {
            if (item % 5 == 0) {
                System.out.print(" " + item);
            }
        }
        System.out.println();
        /////////////////////////////////////////////
        //task 5
        System.out.print("task 5: ");
        double[] arr5 = {123.1, 12.35, 32, -4, -5.32, 45}; // 24.12 < num < 467.23
        for (double item : arr5) {
            if (item < 467.23 && item > 24.12) {
                System.out.print(" " + item);
            }
        }
        System.out.println();
        ////////////////////////////////////////////
        // task 6
        System.out.print("task 6: ");
        int[] arr6 = {12, 3, 4, 6, 8, 7, 6, -8, 15}; //
        for (int item : arr6) {
            if (item % 2 == 0) {
                System.out.print(" " + item);
            }
        }
        System.out.println();
        //////////////////////////////////////////////
        // task 7
        System.out.println("task 7: 0<N<21  0<i<11 ");
        int N = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
        ///////////////////////////////////////////////
    }
}
