import java.util.Scanner;

public class proba {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        int count = Integer.parseInt(SC.nextLine());
        int salary = Integer.parseInt(SC.nextLine());
        int i = 0;

        while (i < count) {
            i++;
            if (salary > 0) {
                String web = SC.nextLine();
                if (web.equals("Facebook")) {
                    salary -= 150;
                }
                if (web.equals("Instagram")) {
                    salary -= 100;
                }
                if (web.equals("Reddit")) {
                    salary -= 50;
                }
            } else {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0) {
            System.out.printf("%d", salary);
        }
    }
}