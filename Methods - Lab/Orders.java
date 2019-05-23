import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String product=scanner.nextLine();
        int count=Integer.parseInt(scanner.nextLine());
        gerOrders(product,count);
    }

    private static void gerOrders(String product, int count) {
        double price=0;
        switch (product){
            case "coffee":
                price=1.5;
                break;
            case "water":
                price=1;
                break;
            case "coke":
                price=1.4;
                break;
            case "snacks":
                price=2;
                break;
        }
        System.out.printf("%.2f",price*count);
    }
}
