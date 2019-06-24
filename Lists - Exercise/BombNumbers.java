import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List<Integer> bombs= Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int[] specialBomb=Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int bomb=specialBomb[0];
        int power=specialBomb[1];

        for (int i = 0; i <bombs.size(); i++) {
            if(bombs.get(i)==bomb){
                int start=Math.max(i-power,0);
                int finish=Math.min(i+power,bombs.size()-1);
                for (int j = start; j <=finish ; j++) {
                    bombs.remove(start);
                }
            }
        }
        int sum=0;
        for (int i = 0; i <bombs.size() ; i++) {

            sum+=bombs.get(i);

        }
        System.out.println(sum);
    }
}
