import java.util.Scanner;

public class DungeonestDark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = 100;
        int coin = 0;
        String[] room = scanner.nextLine().split("\\|");
        int bestroom;
        for (int i = 0; i < room.length; i++) {
            String[] roomData = room[i].split("\\s+");
            String item = roomData[0];
            int itemValue = Integer.parseInt(roomData[1]);
            if (item.equals("potion")) {
                if (itemValue + health > 100) {
                    itemValue = 100 - health;
                }
                health += itemValue;


                System.out.printf("You healed for %d hp.%n", itemValue);
                System.out.printf("Current health: %d hp.%n", health);
            } else if (item.equals("chest")) {
                System.out.printf("You found %d coins.%n", itemValue);
                coin += itemValue;
            } else {
                health -= itemValue;
                if (health > 0) {
                    System.out.printf("You slayed %s.%n", item);

                } else {
                    System.out.printf("You died! Killed by %s.%n", item);
                    bestroom = i + 1;
                    System.out.printf("Best room: %d%n", bestroom);
                    break;
                }
            }


        }
        if (health > 0) {
            System.out.println("You've made it!");
            System.out.println("Coins: " + coin);
            System.out.println("Health: " + health);

        }
    }
}
