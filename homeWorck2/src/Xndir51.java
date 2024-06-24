public class Xndir51 {
    public static void main(String[] args) {
        boolean t ; // true kam false
        int n = 586;
        int miavor = n % 10 ;
        int tasnavor = ((n - miavor ) % 100)/10;
        int haryuravor =( n-(n % 100))/100;
        if(miavor == tasnavor+haryuravor){
            t = true;
        }else{
            t = false;
        }
        System.out.println(t);
    }
}
