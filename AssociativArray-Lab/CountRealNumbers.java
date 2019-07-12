import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();
        TreeMap<Double,Integer> counts=new TreeMap<>();
        for (int i = 0; i <input.length ; i++) {
            if(!counts.containsKey(input[i])){
                counts.put(input[i],0);
            }
            counts.put(input[i],counts.get(input[i])+1);
        }

        for (Map.Entry<Double, Integer> count : counts.entrySet()) {
            DecimalFormat df=new DecimalFormat("#.#####");
            System.out.printf("%s -> %d%n",df.format(count.getKey()),count.getValue());
        }


    }


}
