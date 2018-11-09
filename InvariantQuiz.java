import java.util.List;

public class InvariantQuiz {

    static class Mammal {}
    static class Dog extends Mammal {}

    static <T extends Mammal> void print(List<T> mammals) {
        mammals.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Dog> dogs = null;
        print(dogs);
    }
}
