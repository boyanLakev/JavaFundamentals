import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String city;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }
    public String getCity(){
        return city;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public Student(String firstName,String lastName,int age,String city){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.city=city;

    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        List<Student> students=new ArrayList<>();
        String line=scanner.nextLine();

        while (!line.equals("end")){
            String[]  tokens = line.split(" ");

            String fitstName = tokens[0];
            String lastName= tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String city = tokens[3];
            Student student= new Student(fitstName,lastName,age,city);
            students.add(student);
            line = scanner.nextLine();
        }
        String filterCity= scanner.nextLine();
        for(Student student  :students){
            if (student.getCity().equals(filterCity)){
                System.out.printf("%s %s is %d years old%n",
                        student.getFirstName()
                        ,student.getLastName()
                        ,student.getAge()
                        ,student.getCity());
            }
        }

    }
}
