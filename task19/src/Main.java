public class Main {
    public static void conversionOfCelsiusToFahrenheit(float degrees){
        try {
            if(degrees <= -273.15f){
                throw new Error("Температура равна абсолютному нулю");
            }
            else{
                System.out.println(degrees*1.8+32);
            }
        }
        catch (Error error){
            System.out.println(error.getMessage());
        }
    }

    public static void main(String[] args) {
        conversionOfCelsiusToFahrenheit(-280f);
    }
}


