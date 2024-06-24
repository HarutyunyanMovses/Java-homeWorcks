public class Xndir36 {
    public static void main(String[] args) {
        int a = 4;
        int b = 78;
        int c = -41;
        int d = -10;
        // ete tiv % 2 stanum enq mek da nshanakum e vor tiv kent e
        // ab ac ad  bc bd da dc
        if (a % 2 == 1 && b % 2 == 1 || a % 2 == 1 && c % 2 == 1 || a % 2 == 1 && d % 2 == 1
                || b % 2 == 1 && c % 2 == 1 || b % 2 == 1 && d % 2 == 1
                || d % 2 == 1 && c % 2 == 1 || d%2==1&&a%2==1) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }

        if (a % 2 == 1 && (b % 2 == 1 || c % 2 == 1 || d % 2 == 1)||
        b % 2 == 1 && (c % 2 == 1 ||  d % 2 == 1) ||
        c % 2 == 1 && d % 2 == 1) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
        /// (a % 2 == 1 && (b % 2 == 1 || c % 2 == 1 || d % 2 == 1)  ==  a % 2 == 1 && b % 2 == 1 || a % 2 == 1 && c % 2 == 1 || a % 2 == 1 && d % 2 == 1
        //  2x + 3x = z  ==> x*(2+3) =z ==> 2x + 3x = z
    }
}
