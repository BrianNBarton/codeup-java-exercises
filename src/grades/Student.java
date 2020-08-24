package grades;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    public static void main(String[] args) {

        Student Bob = new Student("Bob Dyllan");
        Bob.addGrade(33);
        Bob.addGrade(44);
        Bob.addGrade(70);
        Bob.addGrade(85);
        Bob.addGrade(100);
        System.out.println(Bob.getName() + "'s grade avg: " + Bob.getGradeAverage());
    }

    private final String name;
    private final ArrayList<Integer> grades;
    private final HashMap<String, String> attendance;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }
    //Return student name
    public String getName() {
        return this.name;
    }

    //adding in the grade to the grades prop
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }


    public double getGradeAverage() {
        int sum = 0;

        for(double grade: this.grades) {
            sum += grade;
        }
        return (double) sum / this.grades.size();
    }
    public void Attendance(String date, String value) {
        this.attendance.put(date, value);
    }
    public HashMap<String, String> getAttendance() {
        return this.attendance;
    }
    public double attendancePercentage() {
        double absences = 0;

        for(String a: this.attendance.values()) {
            if(a.equals("A")) {
                absences++;
            }
        }
        return ((this.attendance.size() - absences) / this.attendance.size()) * 100;
    }
}
