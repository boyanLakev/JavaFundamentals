import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers2 {
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

        while(bombs.contains(bomb)){
            int index=bombs.indexOf(bomb);
            int left=Math.max(0,index-power);
            int right=Math.min(index+power,bombs.size()-1);
            for (int i = right; i >=left ; i--) {
                bombs.remove(i);
            }

        }
        int sum=0;
        for (int i = 0; i <bombs.size() ; i++) {

            sum+=bombs.get(i);

        }
        System.out.println(sum);
    }

}
