package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student Anton = new Student("Anton", "119");
        Teacher Ivan = new Teacher("Ivan", "Informatics");

        System.out.println(Anton.getGroupName());
        System.out.println(Ivan.getSubjectName());
        System.out.println();
        Anton.printInfo();
        System.out.println();
        Ivan.printInfo();
    }
}
