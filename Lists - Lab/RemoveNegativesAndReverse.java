import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List<Integer> list= Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)<0){
                list.remove(i);
                i--;
            }
        }
        Collections.reverse(list);
        if (list.isEmpty()){
            System.out.println("empty");
        }else {
            for (int i = 0; i <list.size() ; i++) {
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
        }

    }
}
