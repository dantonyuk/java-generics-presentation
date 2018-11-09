public class Bounds {

    interface A {}
    interface B {}

    public static class Gen<T extends A & B> {
        private T value;

        public Gen(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        class AB implements A, B {}
        Gen<AB> ab = new Gen<>(new AB());
        B b = ab.getValue();
    }

    interface Copyable<T extends Copyable<T>> {
        T copy();
    }

    //static <T extends Copyable<T> & Comparable<T>> T copyMax(T left, T right) {
    static <T extends Comparable<T> & Copyable<T>> T copyMax(T left, T right) {
        T max = (left.compareTo(right) > 0) ? left : right;
        return max.copy();
    }
}
