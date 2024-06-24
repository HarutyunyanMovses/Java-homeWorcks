public class Xndir53 {
    public static void main(String[] args) {
        int n = 586;
        int k = 600;
        int m = n % 10;
        int t = ((n - m) % 100) / 10;
        int h = (n - (n % 100)) / 100;
        float res;
        res = n > k && m != 0 ? n / (m + k + h) : n / m;
        System.out.println(res);
    }
}
