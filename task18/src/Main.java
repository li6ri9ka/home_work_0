public class Main {

    public static void findingTheSquareRoot(int a){
        try {
            if(a < 0){
                throw new ArithmeticException("Отрицательное число");
            }
            else {
                System.out.println(Math.sqrt(a));
            }
        }
        catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException.getMessage());
        }
    }

    public static void main(String[] args) {
        findingTheSquareRoot(6);
    }
}
