import java.util.Scanner;

public class SpringVacationTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double priceKilometar = Double.parseDouble(scanner.nextLine());
        double foodPerdon = Double.parseDouble(scanner.nextLine());
        double roomPerson = Double.parseDouble(scanner.nextLine());
        double food = foodPerdon * people * day;
        double room = roomPerson * people * day;
        if (people > 10) {
            room *= 0.75;
        }
        double curent = food + room;
        double fuel ;
        for (int i = 1; i <= day; i++) {
            double distanse = Double.parseDouble(scanner.nextLine());
            fuel = distanse * priceKilometar;
            curent += fuel;


            if (i % 3 == 0 || i % 5 == 0) {

                curent += curent * 0.4;
            }

            if (i % 7 == 0) {
                curent -= curent / people;
            }
            if(curent>budget){
                break;
            }



        }
        if (budget - curent >= 0) {
            System.out.printf("You have reached the destination." +
                            " You have %.2f$ budget left.",
                    budget - curent
            );
        } else {
            System.out.printf("Not enough money to continue the trip." +
                            " You need %.2f$ more."
                    , Math.abs(budget-curent)
            );
        }
    }
}
