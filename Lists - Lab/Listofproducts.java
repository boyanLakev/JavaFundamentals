import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Listofproducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        List<String> product= new ArrayList<>();
        for (int i = 0; i <num ; i++) {
            product.add(scanner.nextLine());
        }
        Collections.sort(product);
        for (int i = 0; i <product.size() ; i++) {
            System.out.println(i+1+"."+product.get(i));
        }

    }
}
