import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MOBAChallenger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Integer>> moba = new TreeMap<>();
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("Season end")) {
                break;
            }
            if (line.contains(" -> ")) {
                String[] playerSkill = line.split(" -> ");
                String name = playerSkill[0];
                String skill = playerSkill[1];
                int point = Integer.parseInt(playerSkill[2]);
                if (!moba.containsKey(name)) {
                    moba.put(name, new TreeMap<>());
                }
                if (moba.get(name).containsKey(skill)) {
                    if (moba.get(name).get(skill) < point) {
                        moba.get(name).put(skill, point);
                    }
                } else {
                    moba.get(name).put(skill, point);
                }
            }
            if (line.contains(" vs ")) {
                String[] vs = line.split(" vs ");
                if (moba.containsKey(vs[1]) && moba.containsKey(vs[0])) {
                    int sum1 = 0;
                    int sum2 = 0;
                    for (Map.Entry<String, Integer> entry : moba.get(vs[0]).entrySet()) {
                        sum1 += entry.getValue();
                    }
                    for (Map.Entry<String, Integer> entry : moba.get(vs[1]).entrySet()) {
                        sum2 += entry.getValue();
                    }
                    if (sum1 != sum2) {
                        String win;
                        String loser;
                        if (sum1 > sum2) {
                            win = vs[0];
                            loser = vs[1];

                        } else {
                            win = vs[1];
                            loser = vs[0];
                        }


                        for (Map.Entry<String, Integer> entry : moba.get(win).entrySet()) {
                            String skill
                                    = entry.getKey();

                            if (moba.get(loser).containsKey(skill)) {
                                moba.get(vs[1]).remove(skill);

                            }
                        }
                    }

                }

            }
        }
        Map<String, Integer> totalSkill = new TreeMap<>();
        for (Map.Entry<String, Map<String, Integer>> entry : moba.entrySet()) {
            String name = entry.getKey();
            int sum = 0;
            for (Map.Entry<String, Integer> integerEntry : entry.getValue().entrySet()) {
                sum += integerEntry.getValue();
            }


                totalSkill.put(name, sum);

        }
        totalSkill.entrySet().stream()
                .filter(e-> e.getValue()>0)
                .sorted((e1, e2) -> {
                    int sort = Integer.compare(e2.getValue(), e1.getValue());
                    if (sort == 0) {
                        sort = e1.getKey().compareTo(e2.getKey());

                    }
                    return sort;
                })
                .forEach(e -> {
                    System.out.printf("%s: %d skill%n", e.getKey(), e.getValue());
                    moba.get(e.getKey()).entrySet().stream()
                            .sorted((e1, e2) -> {
                                int sort = Integer.compare(e2.getValue(), e1.getValue());
                                if (sort == 0) {
                                    sort = e1.getKey().compareTo(e2.getKey());

                                }
                                return sort;
                            }).forEach(e2 -> {
                        System.out.printf("- %s <::> %d%n", e2.getKey(), e2.getValue());
                    });
                });


    }
}
