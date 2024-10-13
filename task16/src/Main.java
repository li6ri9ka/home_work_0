public class Main {

    public static void concontenationOfTwoStrings (String a, String b){
        try {
            if((a == null || b == null) || (a.equals("") || b.equals(""))){
                throw new NullPointerException("Одна из строк ровна null");
            }
            else{
                System.out.println(a + b);
            }
        }
        catch (NullPointerException nullPointerException){
            System.out.println(nullPointerException.getMessage());
        }

    }

    public static void main(String[] args) {
        concontenationOfTwoStrings("qwe","");
    }
}
