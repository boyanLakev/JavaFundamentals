import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = ">>([A-Za-z]+)<<(\\d+\\.?\\d*)!(\\d+)";
        Pattern pattern = Pattern.compile(regex);
        List<String> stock = new ArrayList<>();
        double sum = 0;
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("Purchase")) {
                break;
            }
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                String kind = matcher.group(1);
                double price = Double.parseDouble(matcher.group(2));
                int quality = Integer.parseInt(matcher.group(3));
                double current = price * quality;
                sum += current;
                stock.add(kind);

            }
        }
        System.out.println("Bought furniture:");
        for (String s : stock) {
            System.out.println(s);
        }
        System.out.printf("Total money spend: %.2f",sum);

    }
}
