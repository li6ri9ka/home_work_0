import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void checkingTheDateForCorrectness(String dateToEnter, String formatDate){
        DateTimeFormatter format = DateTimeFormatter.ofPattern(formatDate);
        try {
            format.parse(dateToEnter);
            System.out.println("Дата записан по правильно");
        }
        catch (DateTimeException de){
            System.out.println("Дата записана неправильно");
        }

    }

    public static void main(String[] args) {
        checkingTheDateForCorrectness("31.12.2024","dd.MM.yyyy");
    }
}
