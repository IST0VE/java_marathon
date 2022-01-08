package day6;

import java.util.Random;

public class Teacher {

    private String teacherName;
    private String subjectName;

    public Teacher(String teacherName, String subjectName) {
        this.teacherName = teacherName;
        this.subjectName = subjectName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }


    public void evaluate(String studentName){
        Random random = new Random();
        int randomGrade = 2 + random.nextInt(4);
        String grade = "";
        if (randomGrade == 5){
            grade = "отлично";
        }
        else if (randomGrade == 4){
            grade = "хорошо";
        }
        else if (randomGrade == 3){
            grade = "удовлетворительно";
        }
        else if (randomGrade == 2){
            grade = "неудовлетворительно";
        }
        System.out.println("Преподаватель " + teacherName + " оценил студента с именем " + studentName +
                " по предмету " + subjectName + " на оценку " + grade);
    }
}
