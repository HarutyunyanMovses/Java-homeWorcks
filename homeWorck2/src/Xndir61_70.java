public class Xndir61_70 {
    public static void main(String[] args) {
        double num = 5643;
        double m = num % 10;
        double t = (num % 100 - m) / 10;
        double h = (num % 1000 - num % 100) / 100;
        double ha = (num - num % 1000) / 1000;
        /////////////////////////////////////
        //61
        boolean o = m + t == h + ha ? true : false;
        System.out.println("xndir 61: " + o);
        //62
        double res = num < 5000 ? num / (m + h) : num / (ha + t);
        System.out.println("xndir 62: " + res);
        //63
        if (m == 1 || t == 1 || h == 1 || ha == 1) {
            System.out.println("xndir 63: " + 1);
        } else System.out.println("xndir 63: " + 0);
        //64
        char y = m + t == 5 ? 's' : 'd';
        System.out.println("xndir 64: " + y);
        //65
        int q = m * t == 12 ? 12 : 0;
        System.out.println("xndir 65: y=" + q);
        //66
        String s = ha == 4 & m == 4 ? "YES" : "NO";
        System.out.println("xndir 66: " + s);
        //67
        System.out.println("xndir 66: " + (num == (m + t + h + ha) * (m + t + h + ha) ? "YES" : "NO"));
        //68
        System.out.println("xndir 68: " + (m > t ? m * h : 1));
        //69
        int p = m+t+h+ha>20?1:0;
        System.out.println("xndir 69: "+p);
        //70
        int k = m*t*h*ha>200?0:1;
        System.out.println("xndir 70: "+1);
    }
}
