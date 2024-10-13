public class Main {
    public static void findingMaximumNumber(int a, int b){
        try {
            if (a > b){
                System.out.println("a больше b");
            }
            else if (a < b){
                System.out.println("b больше a");
            }
            else{
                throw new Exception("Ошибка: Числа равны");
            }

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    public static void main(String[] args) {
        findingMaximumNumber(4,4);
    }
}
