import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloFrance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        double budget=Double.parseDouble(scanner.nextLine());
        String[]  cont=input.split("\\|");
        List<Double> priceBuy=new ArrayList<>();
        for (int i = 0; i <cont.length ; i++) {
            String[] current=cont[i]. split("->");
            String type=current[0];
            double price=Double.parseDouble(current[1]);
            boolean Posible=false;
            switch (type){
                case "Clothes":
                    if (price<=50){
                        Posible=true;
                    }
                    break;
                case "Shoes":
                    if (price<=35){
                        Posible=true;
                    }
                    break;
                case "Accessories":
                    if (price<=20.50){
                        Posible=true;
                    }
                    break;
            }
            if (Posible){
                if(budget>=price){
                    budget-=price;
                    priceBuy.add(price);
                }
            }
        }
        double sum=0;
        double oldsum=0;
        for (int i = 0; i <priceBuy.size() ; i++) {
            oldsum+=priceBuy.get(i);
            priceBuy.set(i,priceBuy.get(i)*1.4);
            sum+=priceBuy.get(i);
            System.out.printf("%.2f ",priceBuy.get(i));

        }
        System.out.println();
        System.out.printf("Profit: %.2f",sum-oldsum);
        System.out.println();
        if (sum+budget<150){
            System.out.println("Time to go.");
        }else{
            System.out.println("Hello, France!");
        }


    }
}
