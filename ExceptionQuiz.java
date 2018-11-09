public class ExceptionQuiz {

   public static class NumberException<N extends Number> extends Exception {

       private final N number;

       public NumberException(N number) {
           super();
           this.number = number;
       }

       public N getNumber() {
           return number;
       }
   }

   public static void main(String[] args) {
       try {
           throw new NumberException<Integer>(5);
       }
       catch (NumberException<Long> longEx) {
           System.out.println("Long: " + longEx.getNumber());
       }
       catch (NumberException<Integer> intEx) {
           System.out.println("Integer: " + intEx.getNumber());
       }
   }
}
