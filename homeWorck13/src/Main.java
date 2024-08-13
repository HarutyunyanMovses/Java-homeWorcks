import java.util.*;

public class Main {
    public static void main(String[] args) {
        generationTime(new ArrayList<Integer>(), 100);
        System.out.println(validString("{({([])([])})([]){}}"));

    }

    public static void generationTime(Collection<Integer> coll, int size) {
        for (int i = 0; i < size; i++) {
            coll.add(new Random().nextInt());
        }

        System.out.println("**********start removing************");
        long start = System.currentTimeMillis();

        Iterator<Integer> iterator = coll.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("generation time " + (end - start) / 1000.0);
        System.out.println("***************** end ******************");
    }

    public static boolean validString(String str) {
        Stack<Character> scobs = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                scobs.push(c);
                continue;
            }
            switch (c) {
                case '}': {
                    if (scobs.peek() == '{') {
                        scobs.pop();
                    } else {
                        return false;
                    }
                    break;
                }
                case ']': {
                    if (scobs.peek() == '[') {
                        scobs.pop();
                    } else {
                        return false;
                    }
                    break;
                }
                case ')': {
                    if (scobs.peek() == '(') {
                        scobs.pop();
                    } else {
                        return false;
                    }
                    break;
                }
            }
        }
        return scobs.empty();
    }
}
