import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String regex = "\\b(?<day>\\d{2})([ \\/\\-\\.])(?<month>[A-z][a-z][a-z])\\2(?<year>\\d{4})\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher data= pattern.matcher(string);
        while (data.find()){
            String day=data.group("day");
            String month=data.group("month");
            String year=data.group("year");
            System.out.printf("Day: %s, Month: %s, Year: %s%n",day,month,year);
        }
    }
}