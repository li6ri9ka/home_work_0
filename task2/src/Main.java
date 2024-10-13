public class Main {
    public static void dividingTwoNumbers(int a, int b){
        try {
            if(a != 0 || b != 0) {
                System.out.println(a/b);
            }
        }
        catch (ArithmeticException ex){
            System.out.println("Ошибка: Деление на ноль невозможно!");
        }

    }
    public static void main(String[] args) {
        dividingTwoNumbers(4,0);
    }
}
