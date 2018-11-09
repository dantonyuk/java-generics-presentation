import java.util.List;

public class GenTypeQuiz {

    public static void main(String[] args) {

        class Animal {}
        class Dog extends Animal {}

        List<Animal> animals = null;
        List<Dog> dogs = null;
        animals = dogs;
        dogs = animals;
        Dog dog = null;
        animals.add((Animal) dog);
    }
}
