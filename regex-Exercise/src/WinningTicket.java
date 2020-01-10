import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tickets = scanner.nextLine().split("[, ]+");
        for (int i = 0; i < tickets.length; i++) {
            String ticket = tickets[i];

            Pattern pattern = Pattern.compile("^.{20}$");
            Matcher matcher = pattern.matcher(ticket);
            if (!matcher.find()) {
                System.out.println("invalid ticket");

                continue;
            }
            pattern = Pattern.compile("(.*?(([\\$\\@\\^\\#])(\\3){5,9}).*?)(.*?\\2.*?)");
            matcher = pattern.matcher(ticket);
            if (!matcher.find()) {
                System.out.printf("ticket \"%s\" - no match%n", ticket);
                continue;
            }
            String win = matcher.group(2);

            int longer = win.length();
            char ch = win.charAt(0);
            String right=ticket.substring(10);

            if(!right.contains(win)){
                System.out.printf("ticket \"%s\" - no match%n", ticket);
                continue;
            }

            if (longer == 10) {
                System.out.printf("ticket \"%s\" - %d%s Jackpot!%n", ticket, longer, "" + ch);
            } else {
                System.out.printf("ticket \"%s\" - %d%s%n", ticket, longer, "" + ch);
            }



        }


    }
}
