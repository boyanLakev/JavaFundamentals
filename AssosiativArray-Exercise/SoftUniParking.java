import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Map<String,String> parking=new LinkedHashMap<>();
        for (int i = 0; i <n ; i++) {
            String[] line=scanner.nextLine().split("\\s+");
            String command=line[0];
            String person=line[1];
            if (command.equals("register")){
                String license=line[2];
                if (!parking.containsKey(person)){
                    parking.put(person,license);
                    System.out.printf("%s registered %s successfully%n",person,parking.get(person));

                }else{
                    System.out.printf("ERROR: already registered with plate number %s%n",parking.get(person));
                }

            }else if(command.equals("unregister")) {
                if (parking.containsKey(person)){
                    parking.remove(person);
                    System.out.printf("%s unregistered successfully%n",person);
                }else{
                    System.out.printf("ERROR: user %s not found%n",person);
                }

            }

        }
        parking.forEach((k,v)-> System.out.printf("%s => %s%n",k,v));
    }
}
