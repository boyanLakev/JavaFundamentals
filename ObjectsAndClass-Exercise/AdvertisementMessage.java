import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        String[]	phrases= {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] 	events = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] 	authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] 	cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        Random rnd=new Random();
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            int ph=rnd.nextInt(phrases.length-1);
            int ev=rnd.nextInt(events.length-1);
            int au=rnd.nextInt(authors.length-1);
            int ci=rnd.nextInt(cities.length-1);
            System.out.printf("%s %s %s-%s",phrases[ph],events[ev],authors[au],cities[ci]);
            System.out.println();


        }



    }
}
