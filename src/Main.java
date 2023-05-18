import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EducationCenter university1 = new University("KRSU",  "Kyrgyz Republic", LocalDate.of(1995,9,1));
        EducationCenter university2 = new University("KNU",  "Kyrgyz Republic", LocalDate.of(1926,9,1));

        EducationCenter college1 = new College("KRSU college",  "Kyrgyz Republic", LocalDate.of(2001,9,1));
        EducationCenter college2 = new College("KNU college",  "Kyrgyz Republic", LocalDate.of(1998,9,1));

        EducationCenter school1 = new School("Number 5",  "Kyrgyz Republic", LocalDate.of(1930,9,1));
        EducationCenter school2 = new School("Number 72",  "Kyrgyz Republic", LocalDate.of(1998,9,1));

        Student student1 = new Student("Asan", "Asanov", "male", LocalDate.of(2017,9,1), university1 );
        Student student2 = new Student("Uson", "Usonov", "male", LocalDate.of(2007,9,1), university2 );

        Student student3 = new Student("Alex", "Asan", "male", LocalDate.of(2007,9,1), college1 );
        Student student4 = new Student("Uli", "Ulman", "male", LocalDate.of(2007,9,1), college2 );

        Student student5 = new Student("Ivan", "Ivanov", "male", LocalDate.of(2017,9,1), school1 );
        Student student6 = new Student("Egor", "Alexeev", "male", LocalDate.of(2007,9,1), school2 );

        Student[] students = {student1, student2, student3, student4, student5, student6};
        studentsInfo(students);
    }
    public static void studentsInfo(Student[] students){
        for (Student student : students) {
            System.out.println(student);
            student.getYears();
        }
    }
}