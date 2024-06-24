import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a");
        float a = Integer.parseInt(input.nextLine());
        System.out.println("Enter b");
        float b = Integer.parseInt(input.nextLine());
        System.out.println("Enter c");
        float c = Integer.parseInt(input.nextLine());

// task 21; get max number
        System.out.println("Task 21; get max number");
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        ;

// task 22; get min number
        System.out.println("Task 22; get min number");
        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

//task 23;
        System.out.println("Task 23; if at least one of the given numbers is equal to one, then true will be output, otherwise, false");
        if (a == 1 || b == 1 || c == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
//task 24;
        System.out.println("task 24;  if exactly two of the given numbers are equal to two, they will output true, otherwise, false");
        if ((a == 2 && b == 2 && c != 2) || (a == 2 && c == 2 && b != 2) || (b == 2 && c == 2 && a != 2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
//task 25;
        System.out.println("task 25; if it is possible to construct a triangle with segments of such length, then the expression y=1' will be drawn, otherwise, the expression 'y=2'");
        if (a + b > c && c + b > a && a + c > b) {
            System.out.println("y=1");
        } else {
            System.out.println("y=2");
        }
// task 26 ; improviz
        System.out.println("task 26 experiment; will produce one if two of the given numbers are even, otherwise two");
        if (a % 2 == 0 && b % 2 == 0 && c % 2 != 0 || a % 2 == 0 && c % 2 == 0 && b % 2 != 0 || c % 2 == 0 && a % 2 != 0 && b % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
// task 27;
        System.out.println("task 27; will print true if the given numbers form an arithmetic progression, false otherwise");
        // abc acb bac bca cab cba
        if (b - a == c - b || a - c == c - b || a - b == c - a || c - b == a - c || a - c == b - a || b - c == a - b) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
// task 28;
        System.out.println("task 28; will output true if the given numbers form a geometric progression, otherwise false");
        // abc acb bca bac cab cba
        if (b / a == c / b || c / a == b / c || c / b == a / c || a / b == c / a || a / c == b / a || b / c == a / b) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
// task 29
        System.out.println("task 29; the given numbers will be displayed in ascending order");
        if (a < b && a < c) {
            if (b < c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else if (c < b && c < a) {
            if (b < a) {
                System.out.println(c + " " + b + " " + a);
            } else {
                System.out.println(c + " " + a + " " + b);
            }
        }
//     task 30
        System.out.println("task 30; the given numbers will be displayed in descending order");
        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else if (c > b && c > a) {
            if (b > a) {
                System.out.println(c + " " + b + " " + a);
            } else {
                System.out.println(c + " " + a + " " + b);
            }

        }
    }
}