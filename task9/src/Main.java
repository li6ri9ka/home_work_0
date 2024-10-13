public class Main {
    public static void trimmingStringByTheNumberOfCharacters(String lineForCropping, int numberOfCharacters){
        char[]chars = lineForCropping.toCharArray();
            try {
                for (char c : chars) {
                    if (numberOfCharacters > lineForCropping.length()) {
                        throw new Error("Число привышает длину строки");
                    } else if (numberOfCharacters > 0) {
                        System.out.print(c);
                        numberOfCharacters--;
                    }
                }
            }
            catch (Error er){
                System.out.println(er.getMessage());
            }
    }
    public static void main(String[] args) {
        trimmingStringByTheNumberOfCharacters("qaws", 3);
    }
}
