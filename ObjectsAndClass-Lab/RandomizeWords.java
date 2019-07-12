import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        String[] words=text.split("\\s+");
        Random gen=new Random();
        for (int i = 0; i <words.length ; i++) {
            int newPlace=gen.nextInt(words.length);
            String temp=words[newPlace];
            words[newPlace]=words[i];
            words[i]=temp;
        }
        System.out.println(String.join("\n",words));


    }
}
