import java.util.ArrayList;
import java.util.List;

public class GenUsing {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("rope");
        p(strings.get(0));
    }

    private static void p(String s) {
        System.out.println(s);
    }
}
