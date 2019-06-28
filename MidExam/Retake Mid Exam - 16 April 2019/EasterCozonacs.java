import java.util.Scanner;

public class EasterCozonacs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        double priceFlour=Double.parseDouble(scanner.nextLine());

        double priceEggPack=priceFlour*0.75;
        double priceMilk=priceFlour*1.25;
        int milk=0;
        int cozunacs=0;
        int colorEgg=0;
        while (true){
            double newPrice=0;
            newPrice=priceEggPack;
            newPrice+=priceFlour;
            newPrice+=priceMilk/4;

//            if (milk==0) {
//                newPrice += priceMilk;
//                milk = 4;
//            }
//            milk--;
            if (budget-newPrice>=0){
                budget-=newPrice;
                cozunacs++;
                colorEgg+=3;
                if(cozunacs%3==0){
                    colorEgg-=cozunacs-2;
                }
            }else{
                break;
            }


        }
        System.out.printf("You made %d cozonacs! Now you have %d eggs and %.2fBGN left.",cozunacs,colorEgg,budget);
        System.out.println();

    }
}
