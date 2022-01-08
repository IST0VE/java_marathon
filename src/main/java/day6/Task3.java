package day6;

public class Task3 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Алексей Генадьевич", "Информатика");
        Student student = new Student("Сергей");

        teacher.evaluate(student.getStudentName());
    }
}
