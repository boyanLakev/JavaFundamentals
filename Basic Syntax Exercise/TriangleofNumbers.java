import java.util.Scanner;

public class TriangleofNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte d=Byte.parseByte(scanner.nextLine());
        for (byte i=1;i<=d;i++){
            for (byte j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
