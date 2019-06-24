import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> listOne = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> listTwo = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sizeMin = listOne.size();
        int sizeMax = listTwo.size();
        boolean convert = false;
        if (sizeMin > sizeMax) {
            int temp = sizeMin;
            sizeMin = sizeMax;
            sizeMax = temp;
            convert = true;
        }
        List<Integer> ouput = new ArrayList<>();
        for (int i = 0; i < sizeMin; i++) {
            ouput.add(listOne.get(i));
            ouput.add(listTwo.get(i));

        }
        for (int i = sizeMin; i < sizeMax; i++) {
            if (!convert) {
                ouput.add(listTwo.get(i));
            } else {
                ouput.add(listOne.get(i));
            }

        }

        for (int i = 0; i < ouput.size(); i++) {
            System.out.print(ouput.get(i) + " ");
        }

//        System.out.println(ouput.toString().replaceAll("[\\[\\],]", " "));
//        System.out.println();


    }

    private static List<Integer> inputList() {
        Scanner sc = new Scanner(System.in);
        List<Integer> inputList = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return inputList;
    }
}
