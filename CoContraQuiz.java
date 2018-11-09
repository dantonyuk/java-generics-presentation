import java.util.List;
import java.util.ArrayList;

public class CoContraQuiz {

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();

        List<? extends Number> coList = numbers;
        List<? super Number> contraList = numbers;

        coList.add(42);
        contraList.add(42);

        Number coNumber = coList.get(0);
        Number contraNumber = contraList.get(0);
    }
}
