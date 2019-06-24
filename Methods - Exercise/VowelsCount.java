import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String words=scanner.nextLine();
        printVowers(words);
    }

    private static void printVowers(String words) {
        int count=0;
        for (int i = 0; i <words.length() ; i++) {
            char ch=words.charAt(i);
            boolean countPlus= ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e'||ch=='A'||ch=='I'||ch=='O'||ch=='E'||ch=='U';
            if (countPlus)
                count++;
        }
        System.out.println(count);
    }
}
