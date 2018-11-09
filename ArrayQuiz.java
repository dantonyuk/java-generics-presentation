public class ArrayQuiz {

    public static void main(String[] args) {

        class Animal {}
        class Dog extends Animal {}

        Animal[] animals = null;
        Dog[] dogs = null;
        animals = dogs;
        dogs = animals;
    }
}
