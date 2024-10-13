public class Main {

   public static int remainderOfTheDivision(int a, int b) {
       try {


           if (b == 0) {
               throw new NullPointerException("Второе число равно нулю");
           }
       }
       catch (NullPointerException nullPointerException){
           System.out.println(nullPointerException.getMessage());
       }
       return a%b;
   }

    public static void main(String[] args) {
        System.out.println(remainderOfTheDivision(4,2));
    }
}
