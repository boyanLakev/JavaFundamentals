import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int input=Integer.parseInt(scanner.nextLine());
        List<String> guest=new ArrayList<>();

        for (int i = 0; i <input ; i++) {
            String nameAction=scanner.nextLine();
            String[] tokens=nameAction.split(" ");
            if (nameAction.contains("is going")){
                if (guest.contains(tokens[0])){
                    System.out.println(tokens[0]+" is already in the list!");
                }else{
                    guest.add(tokens[0]);
                }
            }else if((nameAction.contains("is not going"))){
                if(guest.contains(tokens[0])){
                    guest.remove(tokens[0]);
                }else{
                    System.out.println(tokens[0]+" is not in the list!");
                }
            }

        }
        for (String contain:guest ) {
            System.out.println(contain);
        }
    }
}
