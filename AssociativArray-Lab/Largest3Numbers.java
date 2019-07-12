import java.util.*;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((a, b) -> b.compareTo(a))
                .limit(3)
                .collect(Collectors.toList());
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
        Map<Integer,Integer> map=new HashMap<>();
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {

        }


    }
}
