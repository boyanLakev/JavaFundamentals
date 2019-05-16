import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login=scanner.nextLine();
        String password="";
        for (int i=0;i<login.length();i++){
            char symbol =login.charAt(i);
            password=""+symbol+password;


        }
        boolean exit=false;
        int cou=4;
        String gues="";
        while (!exit){
            gues=scanner.nextLine();
            cou--;
            if (gues.equals(password)){
                System.out.printf("User %s logged in.",login );
                exit=true;

            }else if(cou==0){
                System.out.printf("User %s blocked!",login);
                break;

            }else {
                System.out.println("Incorrect password. Try again.");
            }


        }
    }
}
