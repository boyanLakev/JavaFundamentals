import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<String>> map=new LinkedHashMap<>();


        for (int i = 0; i <n; i++) {
            String word=scanner.nextLine();
            String synonym=scanner.nextLine();
            map.putIfAbsent(word,new ArrayList<>());
            map.get(word).add(synonym);

        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.print(entry.getKey()+" - ");
            System.out.print(String.join(", ",entry.getValue()));
            System.out.println();
        }

    }
}
