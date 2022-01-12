package day9.Task1;

public class Teacher extends Human{

    private String subjectName;

    public String getSubjectName() {
        return subjectName;
    }

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }

    public void printInfo(){
        super.printInfo(getName());
        System.out.println("Этот преподаватель с именем " + getName());
    }
}
