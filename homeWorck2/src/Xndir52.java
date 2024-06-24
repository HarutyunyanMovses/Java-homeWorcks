public class Xndir52 {
    public static void main(String[] args) {
        boolean bool ; // true kam false
        int n = 511;
        int m = n % 10 ;
        int t = ((n - m ) % 100)/10;
        int h =( n-(n % 100))/100;
        bool = m==t||m==h||t==h?true:false;
        System.out.println(bool);
    }
}
