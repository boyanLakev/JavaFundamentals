import java.sql.Array;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Map<String, Double> prices=new LinkedHashMap<>();
        Map<String,Integer> quatities=new LinkedHashMap<>();
        while(true){
            String line=scanner.nextLine();
            if (line.equals("buy")){
                break;
            }
            String[] shop=line.split("\\s+");
            String product=shop[0];
            double price=Double.parseDouble(shop[1]);
            int quality=Integer.parseInt(shop[2]);

            prices.put(product,price);
            quatities.putIfAbsent(product,0);
            quatities.put(product,quatities.get(product)+quality);
        }
        prices.forEach((k,v)->
                System.out.printf("%s -> %.2f%n",k,v*quatities.get(k)));
    }
}
