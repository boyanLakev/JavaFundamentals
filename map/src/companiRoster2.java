import java.util.*;

public class companiRoster2 {
    static class Employee {
        String name;
        double salary;
        String position;

        String email;
        String age;


        public Employee(String name, double salary, String position, String email, String age) {
            this.name = name;
            this.salary = salary;
            this.position = position;

            this.email = email;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Employee>> map = new HashMap<>();
        List<Employee> list = new ArrayList<>();
        List<String> deparmens = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] part = scanner.nextLine().split("\\s+");
            String name = part[0];
            double salary = Double.parseDouble(part[1]);
            String position = part[2];
            String deparment = part[3];
            String email = (part.length >= 5) ? part[4] : "n/a";
            String age = (part.length >= 6) ? part[5] : "-1";
            Employee x = new Employee(name, salary, position, email, age);

            if (!map.containsKey(deparment)) {
                map.put(deparment, new ArrayList<>());
            }
            map.get(deparment).add(x);



        }
        map.entrySet().stream().sorted((e1,e2)->{
           double f= e1.getValue().stream().map(e->e.salary).mapToDouble(Double::doubleValue).average().getAsDouble();
           double s= e2.getValue().stream().map(e->e.salary).mapToDouble(Double::doubleValue).average().getAsDouble();
           return Double.compare(s,f);
        }).limit(1).forEach(e -> {
                    System.out.println("Highest Average Salary: " + e.getKey());
                    e.getValue().stream().sorted((f,s)->Double.compare(s.salary,f.salary))
                            .forEach(l-> {
                                String formatSalary = String.format("%.2f", l.salary).replace(",", ".");
                                System.out.printf("%s %s %s %s%n", l.name, formatSalary, l.email, l.age);
                            });
                });






    }

}
