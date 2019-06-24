import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = middleCharacters(input);
        System.out.println(output);
    }

    private static String middleCharacters(String input) {
        String output;
        if (input.length() % 2 == 0) {
            output = "" + input.charAt(input.length() / 2 - 1) + input.charAt(input.length() / 2);
        } else {
            output = "" + input.charAt(input.length() / 2);
        }
        return output;
    }
}
