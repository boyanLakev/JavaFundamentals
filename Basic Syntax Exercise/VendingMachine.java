import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String coin=scanner.nextLine();
        double sum=0;
        while(!"Start".equalsIgnoreCase(coin)){
            double coD=Double.parseDouble(coin);
            if(coD==0.1 ||coD==0.2 ||coD==0.5||coD==1||coD==2){
                sum+=coD;
            }else {
                System.out.printf("Cannot accept %.2f%n",coD);
            }

            coin=scanner.nextLine();
        }
        String product=scanner.nextLine();
        while(!"End".equalsIgnoreCase(product)){
            double price=0;
            switch (product){
                case "Nuts":

                    price=2;
                    break;
                case "Water":

                    price=0.7;
                    break;
                case "Crisps":

                    price=1.5;
                    break;
                case "Soda":

                    price=0.8;
                    break;
                case "Coke":

                    price=1;
                    break;

            }
            if (price>0){
                if ((sum-price)>=0){
                    System.out.printf("Purchased %s%n",product);
                    sum-=price;
                }else{
                    System.out.println("Sorry, not enough money");
                }

            }else{
                System.out.println("Invalid product");
            }


            product=scanner.nextLine();
        }
        System.out.printf("Change: %.2f%n",sum);

    }
}
