
public class Main {

    public static void convertStringToNumber(String a){
        try {
            System.out.println("Приобразованная строка: " + Integer.parseInt(a));
        }
        catch (NumberFormatException ex){
            System.out.println("Ошибка: Невозможно преобразовать строку в число");
        }


    }

    public static void main(String[] args) {
        convertStringToNumber("123");
    }
}
