import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    public static class Person {
        String name;
        String ID;
        int age;

        public Person(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getID() {
            return ID;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.",
                    this.name,
                    this.ID,
                    this.age
            );
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("End")) {
                break;
            }
            String[] data = line.split("\\s+");
            String name = data[0];
            String ID = data[1];
            int age = Integer.parseInt(data[2]);
            Person p = new Person(name, ID, age);
            people.add(p);
        }
        people.sort((a,b)->a.age - b.age);

        for (Person pe : people) {
            System.out.println(pe.toString());
        }
    }

}
