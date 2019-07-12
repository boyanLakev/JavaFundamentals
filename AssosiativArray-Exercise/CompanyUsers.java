import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> map = new TreeMap<>();
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("End")) {
                break;
            }
            String[] command = line.split(" -> ");
            String company = command[0];
            String user = command[1];
            map.putIfAbsent(company, new ArrayList<>());
            if (!map.get(company).contains(user)) {
                map.get(company).add(user);
            }
        }
        map.entrySet().stream().forEach(e-> {
            System.out.println(e.getKey());
            e.getValue().stream().forEach(i-> System.out.println("-- "+i));
        });

    }
}
