import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {
    static class Person{
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        List<Person> personList=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            String[] name=scanner.nextLine().split("\\s+");
            Person person=new Person(name[0],Integer.parseInt(name[1]));
            personList.add(person);
        }
        List<Person> filterPerson=new ArrayList<>();
        for (Person p:personList ) {
            if (p.age>30){
                filterPerson.add(p);
            }
        }
        filterPerson.sort((o1, o2) -> o1.name.compareTo(o2.name));
        for (Person p:filterPerson    ) {
            System.out.printf("%s - %d%n",p.name,p.age);
        }
    }
}
