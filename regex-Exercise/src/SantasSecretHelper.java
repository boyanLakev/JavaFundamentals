import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantasSecretHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        List<String> good = new ArrayList<>();
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            StringBuilder lineDescrip = new StringBuilder();
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (Character.isDigit(ch) ) {
                    int chiInt = Integer.parseInt("" + ch);
                    chiInt -= key;
                    lineDescrip.append( ""+chiInt);
                } else {
                    ch = (char) (ch - key);
                    lineDescrip = lineDescrip.append(ch);
                }

            }
            //System.out.println(lineDescrip);
            Pattern pattern = Pattern.compile("@([A-Za-z]+)[^@!<-]+?!G!");
            Matcher matcher = pattern.matcher(lineDescrip);
            if (matcher.find()) {
                good.add(matcher.group(1));

            }
        }
        good.stream().forEach(e -> System.out.println(e));
    }
}
