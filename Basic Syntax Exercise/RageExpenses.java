import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int  game=Integer.parseInt(scanner.nextLine());
        double headsetPrise=Double.parseDouble(scanner.nextLine());
        double mousePrise=Double.parseDouble(scanner.nextLine());
        double keyboardPrise=Double.parseDouble(scanner.nextLine());
        double displayPrise=Double.parseDouble(scanner.nextLine());
        double head=0;
        double mouse=0;
        double keyboard=0;
        double display=0;

        for (int i=1;i<=game;i++){
            if(i%2==0){
                head+=headsetPrise;
            }
            if(i%3==0){
                mouse+=mousePrise;

            }
            if (i%6==0){
                keyboard+=keyboardPrise;

            }
            if (i%12==0){
                display+=displayPrise;

            }
        }

        double sum=head+mouse+keyboard+display;
        System.out.printf("Rage expenses: %.2f lv.",sum);




    }
}

