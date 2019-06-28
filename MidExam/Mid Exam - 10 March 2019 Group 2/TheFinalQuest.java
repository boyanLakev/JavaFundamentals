import java.util.*;
import java.util.stream.Collectors;

public class TheFinalQuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("Stop")) {
                break;
            }
            String[] command = line.split("\\s+");

            switch (command[0]) {
                case "Delete":
                    int index=Integer.parseInt(command[1])+1;
                    if (index>0&&index<list.size()){
                        list.remove(index);
                    }

                    break;
                case "Swap":
                    int firstIndex=list.indexOf(command[1]);
                    int secondIndex=list.indexOf(command[2]);
                    if (firstIndex<0 ||firstIndex>list.size()-1){
                        break;
                    }
                    if(secondIndex<0 || secondIndex>list.size()-1) {
                        break;
                    }

                    String temp=list.get(firstIndex);
                    String temp2=list.get(secondIndex);
                    list.set(firstIndex,temp2);
                    list.set(secondIndex,temp);
                    break;
                case "Put":
                    index=Integer.parseInt(command[2])-1;
                    String word=command[1];
                    if(index<0 || index>list.size()){
                        break;
                    }



                    list.add(index ,word);

                    break;
                case "Sort":
                    Collections.sort(list);
                    Collections.reverse(list);
                    break;
                case "Replace":
                    String word1=command[1];
                    String word2=command[2];
                    index=list.indexOf(word2);
                    if (index!=-1){
                        list.set(index,word1);
                    }

                    break;

            }



        }
        System.out.println(String.join(" ",list));

    }
}
