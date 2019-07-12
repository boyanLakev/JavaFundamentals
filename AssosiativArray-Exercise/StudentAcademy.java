import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> map=new LinkedHashMap<>();
        Map<String,Double> avr=new LinkedHashMap<>();
        for (int i = 0; i <n ; i++) {
            String name=scanner.nextLine();
            double grace=Double.parseDouble(scanner.nextLine());
            map.putIfAbsent(name,new ArrayList<>());
            map.get(name).add(grace);

        }
        for (Map.Entry<String, List<Double>> entry : map.entrySet()) {
           double avrValue=0;
            avrValue = entry.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
            avr.put(entry.getKey(),avrValue);
        }
        double criterial=4.5;
        avr.entrySet().stream()
                .sorted((b,a)->a.getValue().compareTo(b.getValue()))
                .filter(e -> e.getValue() >= criterial)
                .forEach(e-> System.out.printf("%s -> %.2f%n",e.getKey(),e.getValue()));

    }
}
