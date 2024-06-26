public class Matric {
    public static void main(String[] args) {

        int[][] arr = {
                {12, 25, -8, 90},  // 0            4 x 4
                //   0    1   2   3
                {32, 67, 44, 76},  // 1          ///  00 01 02 03
                //   0    1   2   3              ///  10 11 12 13
                {-7, 22, 21, 31},  // 2          ///  20 21 22 23
                //   0   1   2   3               ///  30 31 32 33
                {71, 45, 88, -3},  // 3
                //   0   1   2   3

        };
        ///////////////////////////////////////////////
        System.out.println("glxavor ankunagic");
        ////// glxavor ankunagic
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.print(" " + arr[i][j]);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        ///////////////////////////////////////////////
        System.out.println("yerkrordakan ankyunagic");
        System.out.println("tarberak 1");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j == arr[i].length - 1) {
                    System.out.print(" " + arr[i][j]);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        ///////////////////////////////////////////////
        System.out.println("tarberak 2");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][arr[i].length - 1 - i]);
            System.out.println();
        }
        ///////////////////////////////////////////////
        System.out.println("glxavor ankyunagcic dzax erankyun");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j <= i) {
                    System.out.print(" " + arr[i][j]);
                } else {
                    break;
                }
            }
            System.out.println();
        }
        ///////////////////////////////////////////////
        System.out.println("glxavor ankyunagcic aj erankyun ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j >= i) {
                    System.out.print(" " + arr[i][j]);
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        ///////////////////////////////////////////////
        System.out.println("pokr erankyun sksac jam 12ic");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j < arr.length / 2 && j >= i || j >= arr[i].length / 2 && j <= arr[i].length - 1 - i) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        ///////////////////////////////////////////////
        System.out.println("poqr erankyun jam 3");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i < arr.length / 2 && j >= arr[i].length - 1 - i || i >= arr.length / 2 && i <= j) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        ///////////////////////////////////////////////
        System.out.println("poqr erankyun jam 6");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j < arr[i].length / 2 && j >= arr[i].length - 1 - i || j >= arr[i].length / 2 && i >= j) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        ///////////////////////////////////////////////
        System.out.println("poqr erankyun jam 9");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i < arr.length / 2 && i >= j || i >= arr.length / 2 && i + j <= arr[i].length - 1) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
