import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String wordsDefinition=scanner.nextLine();
        Map<String, List<String>> dictionary=new TreeMap<>();
        String[] wordDefinit=wordsDefinition.split(" \\| ");
        for (int i = 0; i <wordDefinit.length ; i++) {
            String[] part=wordDefinit[i].split(": ");
            String word=part[0];
            String definition=part[1];
            if(!dictionary.containsKey(word)){
                dictionary.put(word,new LinkedList<>());
            }
            dictionary.get(word).add(definition);

        }
        String[] wordsView=scanner.nextLine().split(" \\| ");
        for (int i = 0; i <wordsView.length ; i++) {
            String word=wordsView[i];
            if (dictionary.containsKey(word)){
                System.out.println(word);
                dictionary.get(word).stream()
                        .sorted((e1,e2)->Integer.compare(e2.length(),e1.length()))
                        .forEach(e-> System.out.println(" -"+e));

            }
        }
        String command=scanner.nextLine();
        if (command.equals("List")){
            for (Map.Entry<String, List<String>> entry : dictionary.entrySet()) {
                System.out.print(entry.getKey()+" ");
            }
            System.out.println();

        }



    }
}
