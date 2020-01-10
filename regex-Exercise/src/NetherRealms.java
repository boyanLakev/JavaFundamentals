import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> output = Arrays.stream(scanner.nextLine().split("[, ]+"))
                .sorted((e1,e2)->e1.compareTo(e2))
                .collect(Collectors.toList());
        for (int i = 0 ; i <output.size(); i++) {


            String line = output.get(i);
            Pattern pattern = Pattern.compile("[A-Za-z]");
            Matcher matcher = pattern.matcher(line);
            int health = 0;
            while (matcher.find()) {
                char current = matcher.group().charAt(0);
                health += current;
            }
            pattern = Pattern.compile("[-]?[0-9]+[\\.]?[0-9]*");
            matcher = pattern.matcher(line);
            double damage = 0;
            while (matcher.find()) {
                damage+=Double.parseDouble(matcher.group());
            }
            pattern=Pattern.compile("[*\\/]");
            matcher=pattern.matcher(line);
            while(matcher.find()){
                if (matcher.group().equals("*")){
                    damage=damage*2;
                }else{
                    damage=damage/2;
                }
            }
            System.out.printf("%s - %d health, %.2f damage%n"
            ,line,health,damage);
        }
    }
}
