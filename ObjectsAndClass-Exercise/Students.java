import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Students {
    static class Student {
        String firstname;
        String secondName;
        double grade;

        public Student(String firstname, String secondName, double grade) {
            this.firstname = firstname;
            this.secondName = secondName;
            this.grade = grade;
        }

        public String getFirstname() {
            return firstname;
        }

        public String getSecondName() {
            return secondName;
        }

        public double getGrade() {
            return grade;
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String firstname = data[0];
            String secondname = data[1];
            double grade = Double.parseDouble(data[2]);
            Student studentAll = new Student(firstname, secondname, grade);
            studentList.add(studentAll);

        }
        studentList.sort((o1, o2) -> Double.compare(o2.grade, o1.grade));
        //studentList.sort((Comparator.comparingDouble(Student::getGrade)));

        for (Student student : studentList) {
            System.out.printf("%s %s: %.2f%n",
                    student.getFirstname(),
                    student.getSecondName(),
                    student.getGrade()
            );
        }
    }
}