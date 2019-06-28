import java.util.Scanner;

public class TheHuntingGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double groupEnergy = Double.parseDouble(scanner.nextLine());
        double personWater = Double.parseDouble(scanner.nextLine());
        double personFood = Double.parseDouble(scanner.nextLine());
        double water = day * people * personWater;
        double food = day * people * personFood;
        for (int i = 1; i <= day; i++) {
            double lostEnergy = Double.parseDouble(scanner.nextLine());
            groupEnergy -= lostEnergy;
            if (groupEnergy <= 0) {
                break;
            }
            if (i % 2 == 0) {

                    water -= water * 0.3;

                    groupEnergy *= 1.05;



            }
            if (i % 3 == 0) {

                    food = food - food / people;
                    groupEnergy *= 1.1;

            }
            if (groupEnergy <= 0) {
                break;
            }

        }
        if (groupEnergy > 0) {
            System.out.printf("You are ready for the quest. " +
                            "You will be left with - %.2f energy!",
                    groupEnergy);
        } else {
            System.out.printf("You will run out of energy. " +
                            "You will be left with %.2f food and %.2f water.",
                    food,
                    water);

        }

    }
}
