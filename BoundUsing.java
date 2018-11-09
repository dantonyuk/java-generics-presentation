import java.util.ArrayList;
import java.util.List;

public class BoundUsing {

    static class NumberWrapper<N extends Number> {
        private final N value;

        public NumberWrapper(N value) {
            this.value = value;
        }

        public N getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        NumberWrapper<Integer> num = new NumberWrapper<>(42);
        p(num.getValue());
    }

    private static void p(Integer i) {
        System.out.println(i);
    }
}
