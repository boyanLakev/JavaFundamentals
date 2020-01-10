import java.util.*;

public class OnTheWayToAnnapurna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> annapurna = new LinkedHashMap<>();
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("END")) {
                break;
            }
            String[] part = line.split("->");
            String command = part[0];
            switch (command) {
                case "Add":
                    String store = part[1];
                    String[] item = part[2].split(",");

                    if (!annapurna.containsKey(store)) {
                        annapurna.put(store, new ArrayList<>());
                    }
                    for (int i = 0; i < item.length; i++) {
                        annapurna.get(store).add(item[i]);
                    }
                    break;
                case "Remove":
                    store = part[1];
                    annapurna.remove(store);
            }
        }
        System.out.println("Stores list:");
        annapurna.entrySet().stream()
                .sorted((e1, e2) -> {
                   int sort=Integer.compare(e2.getValue().size(), e1.getValue().size());
                   if(sort==0){
                       sort=e2.getKey().compareTo(e1.getKey());
                   }
                   return sort;
                })
                .forEach(e -> {
                    System.out.println(e.getKey());
                    e.getValue().stream()
                            .forEach(l -> System.out.println("<<" + l + ">>"));
                });
    }
}
