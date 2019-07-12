import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuestsJournal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> quest = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Retire!")) {
                break;
            }
            String[] tokens = input.split(" - ");
            String command = tokens[0];
            if (command.equals("Start")) {
                if (!quest.contains(tokens[1])) {
                    quest.add(tokens[1]);
                }
            } else if (command.equals("Complete")) {
                quest.remove(tokens[1]);
            } else if (command.equals("Side Quest")) {
                String[] questData = tokens[1].split(":");
                String questName = questData[0];
                String sideQuest = questData[1];
                int index = quest.indexOf(questName);
                if (index != -1 && !quest.contains(sideQuest)) {
                    quest.add(index + 1, sideQuest);
                }
            } else if (command.equals("Renew")) {
                if (quest.contains(tokens[1])) {
                    quest.remove(tokens[1]);
                    quest.add(tokens[1]);
                }
            }
        }
        for (int i = 0; i < quest.size(); i++) {
            if (i == quest.size() - 1) {
                System.out.print(quest.get(i));
            } else {
                System.out.print(quest.get(i) + ", ");
            }
        }
    }
}
