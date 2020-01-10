import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> race = new LinkedHashMap<>();
        String[] namePaticipans = scanner.nextLine().split(", ");
        for (int i = 0; i < namePaticipans.length; i++) {
            race.putIfAbsent(namePaticipans[i], 0);

        }
        Pattern alphabetic = Pattern.compile("[A-Za-z]+");
        Pattern digit = Pattern.compile("[0-9]");
        String currentRace = scanner.nextLine();
        while (!currentRace.equals("end of race")) {
            Matcher getAlpha = alphabetic.matcher(currentRace);
            String name = "";
            while (getAlpha.find()) {
                name += getAlpha.group();
            }
            int sum = 0;
            Matcher getDigit = digit.matcher(currentRace);
            while (getDigit.find()) {
                sum += Integer.parseInt(getDigit.group());
            }
            if (race.containsKey(name)) {

                    race.put(name,race.get(name)+ sum);

            }
            currentRace = scanner.nextLine();
        }
        int[] count = {1};
        race.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                .limit(3)
                .forEach(e -> {
                    String part;
                    if (count[0] == 1) {
                        part = "st";
                    } else if (count[0] == 2) {
                        part = "nd";
                    } else {
                        part = "rd";
                    }
                    System.out.printf("%d%s place: %s%n", count[0]++, part, e.getKey());
                });

    }
}
