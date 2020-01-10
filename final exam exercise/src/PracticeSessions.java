import java.util.*;

public class PracticeSessions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> roads = new LinkedHashMap<>();
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("END")) {
                break;
            }
            String[] part = line.split("->");
            String command = part[0];
            switch (command) {
                case "Add":
                    String road = part[1];
                    String racer = part[2];
                    if (!roads.containsKey(road)) {
                        roads.put(road, new ArrayList<>());
                    }
                    roads.get(road).add(racer);
                    break;
                case "Move":
                    String nextRoad = part[3];
                    road = part[1];
                    racer = part[2];
                    if (roads.get(road).contains(racer)) {
                        roads.get(nextRoad).add(racer);
                        roads.get(road).remove(racer);
                    }
                    break;
                case "Close":
                    road = part[1];
                    if (roads.containsKey(road)) {

                            roads.remove(road);

                    }

                    break;

            }




        }
        Map<String,Integer> countRacer=new TreeMap<>();
        for (Map.Entry<String, List<String>> entry : roads.entrySet()) {
            String road=entry.getKey();
            int racers=entry.getValue().size();
            countRacer.put(road,racers);
        }
        System.out.println("Practice sessions:");
        countRacer.entrySet().stream()
                .sorted((e1,e2)->Integer.compare(e2.getValue(),e1.getValue()))
                .forEach(e->{
                    System.out.println(e.getKey());
                    roads.get(e.getKey()).stream()
                            .forEach(l-> System.out.println("++"+l));
                });
    }
}
