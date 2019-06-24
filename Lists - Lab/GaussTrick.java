import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int siz=numbers.size()/2;
        for (int i = 0; i <siz ; i++) {
            numbers.set(i,numbers.get(i)+numbers.get(numbers.size()-1));
            numbers.remove(numbers.size()-1);

        }
        for (int i = 0; i <numbers.size() ; i++) {
            System.out.print(numbers.get(i)+" ");

        }

    }
}
