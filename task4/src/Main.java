public class Main {
    public static void ageVerification(int age){
        try {
            if(age>0 && age<150){
                System.out.println("Проверка пройдена");
            }
            else {
                throw new IllegalArgumentException("Ошибка: Выход за границу значений");
            }
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        ageVerification(150);
    }
}
