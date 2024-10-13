public class Main {

    public static void checkingTheStringForEmptiness(String string){
       try {
           if (string == null || string.isEmpty()){
               throw new Error("Строка пуста или содержит null");
           }
           else{
               System.out.println(string);
           }
       }
       catch (Error error){
           System.out.println(error.getMessage());
       }
    }


    public static void main(String[] args) {
        checkingTheStringForEmptiness(null);
    }
}
