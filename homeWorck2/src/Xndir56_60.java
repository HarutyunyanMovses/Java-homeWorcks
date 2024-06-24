public class Xndir56_60 {
    public static void main(String[] args) {
        double n = 134;
        double m = n % 10;
        double t = ((n - m) % 100) / 10;
        double h = (n - (n % 100)) / 100;
        //56
        if (m > t) {
            System.out.println("xndir 56: m>t " + (m + t + h) / n);
        } else {
            System.out.println("xndir 56: m<t " + n);
        }
        //57
        if (n > 300) {
            System.out.println("Xndir 57: n>300 " + (t / m));
        } else {
            System.out.println("Xndir 57: n<300 " + (h / m));
        }
        //58
        char f = (h + t) < 5 ? 'a' : 'b';
        System.out.println("xndir 58: " + f);
        //59
        System.out.print("xndir 59: achox hert => ");
        if (h < t && h < m) {
            if (t < m) {
                System.out.println(h + " " + t + " " + m);
            } else {
                System.out.println(h + " " + m + " " + t);
            }
        } else if (t < h && t < m) {
            if (h < m) {
                System.out.println(t + " " + h + " " + m);
            } else {
                System.out.println(t + " " + m + " " + h);
            }
        } else if (m < t && m < h) {
            if (t < h) {
                System.out.println(m + " " + t + " " + h);
            } else {
                System.out.println(m + " " + h + " " + t);
            }
        }
        //60
        System.out.print("xndir 60: nvazox hert => ");
        if (h > t && h > m) {
            if (t > m) {
                System.out.println(h + " " + t + " " + m);
            } else {
                System.out.println(h + " " + m + " " + t);
            }
        } else if (t > h && t > m) {
            if (h > m) {
                System.out.println(t + " " + h + " " + m);
            } else {
                System.out.println(t + " " + m + " " + h);
            }
        } else if (m > t && m > h) {
            if (t > h) {
                System.out.println(m + " " + t + " " + h);
            } else {
                System.out.println(m + " " + h + " " + t);
            }

        }
    }
}
