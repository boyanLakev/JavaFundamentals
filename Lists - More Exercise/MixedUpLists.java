import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List<Integer> first= Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> second= Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Collections.reverse(second);
        int range1;
        int range2;
        if (first.size()>second.size()) {
            range1 = first.get(first.size() - 1);
            range2 = first.get(first.size() - 2);
            first.remove(first.size()-1);
            first.remove(first.size()-1);
        }else {
             range1= second.get(second.size() - 1);
             range2= second.get(second.size()-2);
             second.remove(second.size() - 1);
             second.remove(second.size() - 1);
        }

        List<Integer> result=new ArrayList<>();
        for (int i = 0; i <first.size() ; i++) {
            result.add(first.get(i));
            result.add(second.get(i));


        }
        int rangeMin=Math.min(range1,range2);
        int rangeMax=Math.max(range1,range2);
        List<Integer> filterRange= new ArrayList<>();
        for (int i = 0; i <result.size() ; i++) {
            if(result.get(i)>rangeMin && result.get(i)<rangeMax){
                filterRange.add(result.get(i));
            }

        }
        Collections.sort(filterRange);
        for (int element:filterRange ) {
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
