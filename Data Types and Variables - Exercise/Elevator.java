import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int people=Integer.parseInt(scanner.nextLine());
        int capacity=Integer.parseInt(scanner.nextLine());
        int course=(people%capacity!=0) ? people/capacity+1:people/capacity;

        System.out.println(course);

    }
}
