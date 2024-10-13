public class Main {
    public static void convertingANumberToABinarySystem(int number){
        StringBuilder binaryRepresentation = new StringBuilder();
        while (number!=0){
            if(number % 2 == 0){
                binaryRepresentation.append(0);
                number/=2;
            }
            else if (number%2==1){
                binaryRepresentation.append(1);
                number/=2;
            }
        }
        System.out.println(binaryRepresentation.reverse());
    }

    public static void main(String[] args) {
        convertingANumberToABinarySystem(10);
    }
}
