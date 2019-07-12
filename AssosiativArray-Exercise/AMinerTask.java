import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,Integer> map=new LinkedHashMap<>();
        while(true){
            String line=scanner.nextLine();
            if(line.equals("stop")){
                break;
            }
            int count=Integer.parseInt(scanner.nextLine());
            map.putIfAbsent(line,0);

            map.put(line,map.get(line)+count);

        }
        map.entrySet().forEach(e -> System.out.printf("%s -> %d%n",e.getKey(),e.getValue()));
    }
}
