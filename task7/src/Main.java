public class Main {

    public static void checkingTheArrayForZeros(int[]array){
        int countZero = 0;
        try {


            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    countZero++;
                }
            }
            if (countZero != 0) {
                throw new Error("В массиве содержатся нули");
            }
        }catch (Error ex){
            System.out.println(ex.getMessage());
        }
    }


    public static void main(String[] args) {
        int [] array = new int[]{1,0,3,4,5,0};

        checkingTheArrayForZeros(array);
    }
}
