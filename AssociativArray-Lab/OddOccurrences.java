
import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String[] array=scanner.nextLine().toLowerCase().split("\\s+");
        Map<String,Integer> map= new LinkedHashMap<>();
        for (int i = 0; i <array.length; i++) {
            map.putIfAbsent(array[i],0);
            map.put(array[i],map.get(array[i])+1);
        }
        List<String> list=new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()%2!=0){
                list.add(entry.getKey());
            }

        }
        System.out.println(String.join(", ",list));

    }
}
