public class Main {

   public static void checkingPasswordComplexity(String password){
       try {
           if(password.length()<8){
               throw new Error("Длина пароля меньше 8 символов");
           }
           else
           {
               System.out.println("все хорошо");
           }

       }
       catch (Error er){
           System.out.println(er.getMessage());
       }

   }

    public static void main(String[] args) {
        checkingPasswordComplexity("1234568");
    }
}
