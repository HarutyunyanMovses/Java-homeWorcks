public class Xndir54 {
    public static void main(String[] args) {
        int n = 133;
        int maxNum;
        int smaleNum;
        int m = n % 10;
        int t = ((n - m) % 100) / 10;
        int h = (n - (n % 100)) / 100;
        if (m >= t && m >= h) {
            maxNum = m;
        } else if (t >= m && t >= h) {
            maxNum = t;
        } else {
            maxNum = h;
        }
        System.out.println("xndir 54 ; max number " + maxNum);
        ///55
        if (m <= t && m <= h) {
            smaleNum = m;
        } else if (t <= m && t <= h) {
            smaleNum = t;

        } else {
            smaleNum = h;
        }
        System.out.println("xndir 54 ; min number " + smaleNum);
    }
}
