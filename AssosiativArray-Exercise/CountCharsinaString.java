import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsinaString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=String.join("",scanner.nextLine().split("\\s+"));
        Map<Character,Integer> map=new LinkedHashMap<>();
        for (int i = 0; i <text.length() ; i++) {
            char ch=text.charAt(i);
            map.putIfAbsent(ch,0);
            map.put(ch,map.get(ch)+1);

        }
        map.forEach((character, integer) -> System.out.printf("%s -> %d%n",character,integer));
    }
}
