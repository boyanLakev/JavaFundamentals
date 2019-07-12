import java.util.*;
import java.util.stream.Collectors;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> courses=new LinkedHashMap<>();
        while (true){
            String line=scanner.nextLine();
            if(line.equals("end")){
                break;
            }
            String[] element=line.split(" : ");
            String course=element[0];
            String student=element[1];
            courses.putIfAbsent(course,new ArrayList<>());
            courses.get(course).add(student) ;
        }
        courses.entrySet().stream().sorted((a,b)->{
            return  Integer.compare(b.getValue().size(),a.getValue().size());
        }).forEach(e-> {
            System.out.printf("%s: %d%n",e.getKey(),e.getValue().size());
            e.getValue().stream().sorted((a,b)-> a.compareTo(b))
                    .forEach(l->System.out.printf("-- %s%n",l));
        });








    }
}
