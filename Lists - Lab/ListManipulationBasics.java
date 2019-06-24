import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        while (true){
            String line=sc.nextLine();
            if(line.equalsIgnoreCase("end")){
                break;
            }
            String[] tokens = line.split("\\s+");
            switch (tokens[0]){
                case "Add":
                    int numberToAdd=Integer.parseInt(tokens[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove=Integer.parseInt(tokens[1]);
                    numbers.remove(Integer.valueOf(numberToRemove));
                    break;
                case "RemoveAt":
                    int numberToRemoveAt=Integer.parseInt(tokens[1]);
                    numbers.remove(numberToRemoveAt);
                    break;
                case "Insert":
                    int numberToInsert=Integer.parseInt(tokens[1]);
                    int indexToInsert=Integer.parseInt(tokens[2]);
                    numbers.add(indexToInsert,numberToInsert);
                    break;


            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));

    }
}
