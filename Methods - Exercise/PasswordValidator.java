import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean validator = passwordValidator(password);
        if (validator) {
            System.out.println("Password is valid");
        }
    }

    private static boolean passwordValidator(String pass) {
        boolean validat;
        validat = validLenght(pass);
         boolean   val=validSymbol(pass);
        if (!(validat && val)) {
            return false;
        }


        return true;
    }
    private static boolean validSymbol(String pass) {
        int cont = 0;
        boolean validation=true;
        boolean isOhterSymbol=false;
        for (int i = 0; i < pass.length(); i++) {
            char ch=pass.charAt(i);
            if (!(Character.isDigit(ch) || (ch>64&&ch<91)||(ch>96&&ch<123))){
                isOhterSymbol =true;

            }


            if (Character.isDigit(ch))
                cont++;
        }
        if (isOhterSymbol){
                System.out.println("Password must consist only of letters and digits");
                validation=false;

        }
        if(cont<2){
            System.out.println("Password must have at least 2 digits");
            validation=false;
        }

        return validation;
    }




    private static boolean validLenght(String pass) {
        if (pass.length() < 6 || pass.length() > 10){
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
        return true;
    }
}
