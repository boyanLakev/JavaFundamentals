import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Set<String>> map = new LinkedHashMap<>();
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("Lumpawaroo")) {
                break;
            }
            String[] command = line.split("\\s+\\|\\s+|\\s+->\\s+");
            if (line.contains("|")) {
                String forceSide = command[0];
                String forseUser = command[1];
                map.putIfAbsent(forceSide, new TreeSet<>());
                boolean found = false;
                for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
                    if (entry.getValue().contains(forseUser)) {
                        found = true;
                        break;
                    }
                }
                if (!found) {

                    map.get(forceSide).add(forseUser);
                }
            } else if (line.contains("->")) {
                String forceSide = command[1];
                String forseUser = command[0];
                map.putIfAbsent(forceSide, new TreeSet<>());
                for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
                    if (entry.getValue().contains(forseUser)) {
                        entry.getValue().remove(forseUser);

                        break;
                    }
                }
                map.get(forceSide).add(forseUser);
                System.out.printf("%s joins the %s side!%n", forseUser, forceSide);

            }
        }
        map.entrySet().stream()
                .filter(e -> e.getValue().size() > 0)
                .sorted((e1, e2) -> {
                    int sort = Integer.compare(e2.getValue().size(), e1.getValue().size());
                    if (sort == 0) {
                        sort = e1.getKey().compareTo(e2.getKey());
                    }
                    return sort;
                }).forEach(e -> {
            System.out.printf("Side: %s, Members: %d%n", e.getKey(), e.getValue().size());
            e.getValue().stream()
                    .forEach(i ->
                            System.out.println("! " + i));
        });

    }
}
