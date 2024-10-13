

public class Main {

 public static void checkingNumbersForDivisibility(int a, int b){
     try {
         if (b == 0){
             throw new ArithmeticException("Ошибка: Второе число равно 0");
         }
         else{
             if (a % b == 0){
                 System.out.println("Первое число нацело делится на второе");
             }
             else {
                 System.out.println("Первое число нацело не делится на второе");
             }
         }
     }
     catch (ArithmeticException ar){
         System.out.println(ar.getMessage());
     }


 }

    public static void main(String[] args) {
        checkingNumbersForDivisibility(5,0);
    }
}
