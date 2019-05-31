import java.util.Scanner;

public class GamingStore {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double moneyStart=Double.parseDouble(sc.nextLine());
        double moneyAvailable=moneyStart;
        while(true){

            String shoose=sc.nextLine();
            if (shoose.equalsIgnoreCase("Game Time")){
                break;
            }
            double price=0;
            String game=" ";

            switch (shoose){
                case "OutFall 4":
                    price=39.99;
                    game="OutFall 4";
                    break;
                case "RoverWatch Origins Edition":
                    price=39.99;
                    game="RoverWatch Origins Edition";
                    break;
                case "CS: OG":
                    price=15.99;
                    game="CS: OG";
                    break;
                case "Zplinter Zell":
                    price=19.99;
                    game="Zplinter Zell";
                    break;
                case "Honored 2":
                    price=59.99;
                    game="Honored 2";
                    break;
                case "RoverWatch":
                    price=29.99;
                    game="RoverWatch";
                    break;

            }
            if (game.equals(" ")){
                System.out.println("Not Found");
                continue;
            }
            if (moneyAvailable==0){
                break;
            }
            if(moneyAvailable<price){
                System.out.println("Too Expensive");
                continue;
            }else{
                moneyAvailable-=price;
                System.out.printf("Bought %s%n",game);
            }


        }
        if (moneyAvailable==0){
            System.out.println("Out of money!");

        }else{
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", moneyStart-moneyAvailable,moneyAvailable);
        }



    }
}
