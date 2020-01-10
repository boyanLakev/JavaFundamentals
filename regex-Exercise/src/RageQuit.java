import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RageQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile("([\\D]+)(\\d+)");
        Matcher matcher = pattern.matcher(line);
        StringBuilder result = new StringBuilder();
        LinkedHashSet uniqueCount = new LinkedHashSet();
        while (matcher.find()) {
            StringBuilder builder = new StringBuilder();
            String unique = matcher.group(1);
            int repeat = Integer.parseInt(matcher.group(2));
            if (repeat > 0) {
                for (int i = 0; i < unique.length(); i++) {
                    char ch = unique.charAt(i);
                    if (Character.isAlphabetic(ch)) {
                        ch = Character.toUpperCase(ch);
                    }
                    builder.append(ch);

                    uniqueCount.add(ch);

                }
                String currentUnit = builder.toString();

                for (int i = 1; i < repeat; i++) {
                    builder.append(currentUnit);
                }
                result.append(builder);
            }
        }
        System.out.println("Unique symbols used: " + (uniqueCount.size()));
        System.out.println(result);

    }
}