import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Immutable i1 = new Immutable("karen", new Date());
        String s = i1.getName();
        Date d = i1.getDate();
        s = "frunz";
        System.out.println(d);
        d.setTime(0);
        System.out.println(i1.getName());
        System.out.println(i1.getDate());
        //  fibonachi
        // 1 1 2 3 5 8 13 21 34 55
        Main m = new Main();
        System.out.println(" Fibonachi = " + m.getFibonachi(5));

    }

    public int getFibonachi(int n) {
        if (n == 1 || n == 2) return 1;
        int f1 = 1;
        int f2 = 1;
        int fn = 3;
        for (int i = 3; i <= n; i++) {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }
}