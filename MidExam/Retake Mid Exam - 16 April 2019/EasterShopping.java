import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EasterShopping {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List<String> shops= Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String[] command=scanner.nextLine().split("\\s+");
            switch (command[0]){
                case "Include":
                    shops.add(command[1]);
                    break;
                case "Visit":
                    int numberOfShop=Integer.parseInt(command[2]);
                    if (numberOfShop>shops.size()){break;}
                    if (command[1].equals("first")){

                        for (int j = 0; j <numberOfShop; j++) {

                            shops.remove(0);
                        }
                    }else if(command[1].equals("last")){
                        for (int j = 0; j < numberOfShop; j++) {

                            shops.remove(shops.size() - 1);
                        }
                    }


                    break;
                case "Prefer":
                    int indexOne=Integer.parseInt(command[1]);
                    int indexTwo=Integer.parseInt(command[2]);
                    if (indexOne<0 || indexOne>shops.size()-1){break;}
                    if (indexTwo<0 || indexTwo>shops.size()-1){break;}
                    String temp= shops.get(indexOne);
                    shops.set(indexOne,shops.get(indexTwo));
                    shops.set(indexTwo,temp);
                    break;
                case "Place":
                    String shop=command[1];
                    int shopIndex=Integer.parseInt(command[2]);
                    if (shopIndex<0 || shopIndex>shops.size()-1){break;}
                    shops.add(shopIndex+1,shop);
                    break;


            }
        }
        System.out.println("Shops left:");

        System.out.println(String.join(" ",shops));

    }
}
