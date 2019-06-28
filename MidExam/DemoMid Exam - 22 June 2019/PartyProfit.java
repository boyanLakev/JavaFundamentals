import java.util.Scanner;

public class PartyProfit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int partySize=Integer.parseInt(scanner.nextLine());
        int day=Integer.parseInt(scanner.nextLine());
        int money=0;
        for (int i = 1; i <=day ; i++) {
            money+=50;
            if (i%10==0){
                partySize-=2;
            }
            if (i%15==0){
                partySize+=5;
            }

            money-=partySize*2;
            if (i%3==0){
                money-=partySize*3;

            }
            if (i%5==0){
                money+=partySize*20;
                if (i%3==0){
                    money-=partySize*2;
                }

            }



        }
        System.out.printf("%d companions received %d coins each.",partySize,money/partySize);



    }
}
