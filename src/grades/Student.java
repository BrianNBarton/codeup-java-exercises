package grades;


import java.util.ArrayList;

public class Student {


    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    // returns the student's name
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public void getGradeAverage() {
        //total / length
    }


    public static void main(String[] args) {


      //  Student student1 = new Student("Bob Dillon");

       // student1.addGrade(92);
    }
}