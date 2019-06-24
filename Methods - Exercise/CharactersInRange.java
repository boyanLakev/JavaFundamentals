import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        char start=scanner.nextLine().charAt(0);
        char end=scanner.nextLine().charAt(0);
        printRange(start,end);
    }

    private static void printRange(int start, int end) {
        if (start>end){
            int temp=start;
            start=end;
            end=temp;
        }
        for (int i = start+1; i <end ; i++) {
            System.out.print((char)i+" ");

        }
        System.out.println();
    }
}
