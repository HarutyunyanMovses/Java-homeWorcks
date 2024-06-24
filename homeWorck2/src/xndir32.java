public class xndir32 {
    public static void main(String[] args) {
        int a = 4;
        int b = 78;
        int c = -41;
        int d = -10;
        if (a < c && a < b && a < c && a < d) {
            System.out.println(a);
        } else if (b < c && b < a && b < d) {
            System.out.println(b);
        } else if (c < a && c < b && c < d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }
    }
}
