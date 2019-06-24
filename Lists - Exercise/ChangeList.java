import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("end")) {
                break;
            }
            String[] tokens = line.split("\\s+");
            if ("Delete".equalsIgnoreCase(tokens[0])) {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) == Integer.parseInt(tokens[1])) {
                        list.remove(i);
                    }
                }
            } else {
                int index=Integer.parseInt(tokens[2]);
                if (index>=0 && index<list.size()) {
                    list.add(index, Integer.parseInt(tokens[1]));
                }
            }

        }
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
