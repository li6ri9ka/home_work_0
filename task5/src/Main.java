public class Main {

    public static void checkingSqrtForANegativeValue(int a){
        try {
            if (Math.sqrt(a) > 0) {
                System.out.println(Math.sqrt(a));
            } else {
                throw new IllegalArgumentException("Ошибка: Отрицательное значени");
            }
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        checkingSqrtForANegativeValue(5);
    }
}
