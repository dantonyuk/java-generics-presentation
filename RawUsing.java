import java.util.ArrayList;
import java.util.List;

public class RawUsing {

    public static void main(String[] args) {
        List strings2 = new ArrayList();
        strings2.add("rope");
        p((String) strings2.get(0));
    }

    private static void p(String s) {
        System.out.println(s);
    }
}
