public class Main {

    public static void calculatingFactorial(int a){
        try {
            if(a > 0){
                int result = 1;
                while (a > 1) {
                    result *= a;
                    a--;
                }
                System.out.println(result);
            }
            else {
                throw new IllegalArgumentException("Ошибка:  Отриуательное значение факториала");
            }
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }


    public static void main(String[] args) {
        calculatingFactorial(-5);
    }
}
