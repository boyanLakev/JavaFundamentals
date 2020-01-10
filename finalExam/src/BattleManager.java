import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BattleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> battleHealth = new TreeMap<>();
        Map<String, Integer> battleEnergy = new TreeMap<>();

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("Results")) {
                break;
            }
            String[] part = line.split(":");
            String command = part[0];
            switch (command) {
                case "Add":
                    String personName = part[1];
                    int health = Integer.parseInt(part[2]);
                    int energy = Integer.parseInt(part[3]);
                    if (!battleHealth.containsKey(personName)) {
                        battleHealth.put(personName, health);
                    } else {
                        battleHealth.put(personName, battleEnergy.get(personName) + health);
                    }
                    if (!battleEnergy.containsKey(personName)) {
                        battleEnergy.put(personName, energy);
                    }

                    break;
                case "Attack":
                    String attackerName = part[1];
                    String defenderName = part[2];
                    int damage = Integer.parseInt(part[3]);
                    if (battleHealth.containsKey(attackerName) && battleHealth.containsKey(defenderName)) {
                        if (battleHealth.get(defenderName) - damage <= 0) {
                            System.out.println(defenderName + " was disqualified!");
                            battleEnergy.remove(defenderName);
                            battleHealth.remove(defenderName);

                        } else {
                            battleHealth.put(defenderName, battleHealth.get(defenderName) - damage);
                        }
                        if (battleEnergy.get(attackerName)-1<=0){
                            System.out.println(attackerName+ " was disqualified!");
                            battleEnergy.remove(attackerName);
                            battleHealth.remove(attackerName);
                        }else {
                            battleEnergy.put(attackerName,battleEnergy.get(attackerName)-1);
                        }
                    }
                    break;
                case "Delete":
                    String person = part[1];
                    if(person.equals("All")){
                        battleEnergy.clear();
                        battleHealth.clear();
                        break;
                    }
                    battleEnergy.remove(person);
                    battleHealth.remove(person);
                    break;
            }
        }
        int count=0;
        for (Map.Entry<String, Integer> entry : battleHealth.entrySet()) {
            count++;
        }

        System.out.println("People count: " +count);
        battleHealth.entrySet().stream().sorted((e1,e2)->{
            int sort= e2.getValue().compareTo(e1.getValue());
            if (sort==0){
                sort= battleEnergy.get(e2.getKey()).compareTo(battleEnergy.get(e1.getKey()));
            }
            return sort;
        }).forEach(e-> System.out.println(e.getKey()+" - "+e.getValue()+" - "+battleEnergy.get(e.getKey())));

    }
}
