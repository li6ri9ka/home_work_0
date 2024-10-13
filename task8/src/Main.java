public class Main {
    public static void exponentiationCalculator(int degree,int мeaning){
        try {
            if(degree>0){
                int result = 1;
                while (degree > 0) {
                    result *= мeaning;
                    degree--;
                }
            }
            else {
                throw new Error("Отрицательная степень");
            }
        }
        catch (Error er){
            System.out.println(er.getMessage());
        }
    }


    public static void main(String[] args) {
        exponentiationCalculator(4,5);
    }
}
