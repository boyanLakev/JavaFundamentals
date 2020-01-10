import java.util.*;

public class DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> damages = new TreeMap<>();
        Map<String, Integer> healths = new TreeMap<>();
        Map<String, Integer> armors = new TreeMap<>();
        Map<String, List<String>> types = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] part = scanner.nextLine().split("\\s+");
            String type = part[0];
            if (!Character.isUpperCase(type.charAt(0))){
                continue;
            }
            String dragon = part[1];
            if (!Character.isUpperCase(dragon.charAt(0))){
                continue;
            }
            int damage = (part[2].equals("null") ) ? 45 : Integer.parseInt(part[2]);
            int health = (part[3].equals("null") )? 250 : Integer.parseInt(part[3]);
            int armor = (part[4].equals("null") )? 10 : Integer.parseInt(part[4]);

            if (!types.containsKey(type)) {
                types.put(type, new ArrayList<>());
            }
            types.get(type).add(dragon);
            damages.put(dragon, damage);
            healths.put(dragon, health);
            armors.put(dragon, armor);

        }
        types.entrySet().stream()
                .forEach((e) -> {
                    double avrDam = e.getValue()
                            .stream()
                            .map(d -> damages.get(d))
                            .mapToInt(Integer::intValue)
                            .average()
                            .getAsDouble();
                    double avrHealth=e.getValue()
                            .stream()
                            .map(d -> healths.get(d))
                            .mapToInt(Integer::intValue)
                            .average()
                            .getAsDouble();
                    double avrArmor=e.getValue()
                            .stream()
                            .map(d -> armors.get(d))
                            .mapToInt(Integer::intValue)
                            .average()
                            .getAsDouble();
                    String avrDamStr=String.format("%.2f",avrDam);
                    avrDamStr=avrDamStr.replace(",",".");
                    String avrHealthStr=String.format("%.2f",avrHealth);
                    avrHealthStr=avrHealthStr.replace(",",".");
                    String avrArmorStr=String.format("%.2f",avrArmor).replace(",",".");

                    System.out.printf("%s::(%s/%s/%s)%n",e.getKey(),avrDamStr,avrHealthStr,avrArmorStr);
                    Collections.sort(e.getValue());

                    e.getValue().stream()

                            .forEach(elist->
                            System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n",elist,damages.get(elist)
                            ,healths.get(elist),armors.get(elist)));

                });


    }
}
