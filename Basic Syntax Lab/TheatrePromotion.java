import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String day=scanner.nextLine().toLowerCase();
        int age=Integer.parseInt(scanner.nextLine());
        int price=0;
        if (age>=0 && age<=18){
            switch (day){
                case "weekday":
                    System.out.print(12+"$");
                    break;
                case "weekend":
                    System.out.print(15+"$");
                    break;
                case "holiday":
                    System.out.print(5+"$");
                    break;
                    default:System.out.print("Error!");
            }

        }else if (age>18 && age<=64){
            switch (day){
                case "weekday":
                    System.out.print(18+"$");
                    break;
                case "weekend":
                    System.out.print(20+"$");
                    break;
                case "holiday":
                    System.out.print(12+"$");
                    break;
                default:System.out.print("Error!");
            }

        }else if (age>64 && age<=122){
            switch (day){
                case "weekday":
                    System.out.print(12+"$");
                    break;
                case "weekend":
                    System.out.print(15+"$");
                    break;
                case "holiday":
                    System.out.print(10+"$");
                    break;
                default:System.out.print("Error!");
            }

        }else{
            System.out.print("Error!");
        }
    }
}
