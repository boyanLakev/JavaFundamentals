import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group = Integer.parseInt(scanner.nextLine());

        String tax=scanner.nextLine();
        String day=scanner.nextLine();
        double one=0;
        double total=0;
        if ("Students".equalsIgnoreCase(tax)){
            switch (day){
                case "Friday":
                    one=8.45;
                    break;
                case "Saturday":
                    one=9.80;
                    break;
                case "Sunday":
                    one=10.46;
                    break;
            }
            if (group>=30){
                total=group*one*0.85;
            }else{
                total=group*one;
            }

        }else  if ("Business".equalsIgnoreCase(tax)){
            switch (day){
                case "Friday":
                    one=10.9;
                    break;
                case "Saturday":
                    one=15.6;
                    break;
                case "Sunday":
                    one=16;
                    break;
            }
            if (group>=100){
                total=(group-10)*one;
            }else{
                total=group*one;
            }

        }else  if ("Regular".equalsIgnoreCase(tax)){
            switch (day){
                case "Friday":
                    one=15;
                    break;
                case "Saturday":
                    one=20;
                    break;
                case "Sunday":
                    one=22.5;
                    break;
            }
            if (group>=10 && group<=20){
                total=group*one*0.95;
            }else{
                total=group*one;
            }

        }
        System.out.printf("Total price: %.2f",total);
    }
}
