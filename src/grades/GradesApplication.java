package grades;


import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        int addGrade = 0;
        HashMap<String, Student> students = new HashMap<>(addGrade);

        //Student list

        Student Bob = new Student("Bob");
        Bob.addGrade(90);
        Bob.addGrade(85);
        Bob.addGrade(88);
        Bob.Attendance("2020-08-10", "P");
        Bob.Attendance("2020-08-11", "P");
        Bob.Attendance("2020-08-12", "A");
        Bob.Attendance("2020-08-13", "P");
        Bob.Attendance("2020-08-14", "A");
        Bob.Attendance("2020-08-15", "P");

        Student Joe = new Student("Joe");
        Joe.addGrade(73);
        Joe.addGrade(79);
        Joe.addGrade(65);
        Joe.Attendance("2020-08-10", "P");
        Joe.Attendance("2020-08-11", "A");
        Joe.Attendance("2020-08-12", "A");
        Joe.Attendance("2020-08-13", "A");
        Joe.Attendance("2020-08-14", "A");
        Joe.Attendance("2020-08-15", "P");

        Student Sam = new Student("Sam");
        Sam.addGrade(89);
        Sam.addGrade(80);
        Sam.addGrade(95);
        Sam.Attendance("2020-08-10", "P");
        Sam.Attendance("2020-08-11", "P");
        Sam.Attendance("2020-08-12", "P");
        Sam.Attendance("2020-08-13", "P");
        Sam.Attendance("2020-08-14", "P");
        Sam.Attendance("2020-08-15", "P");

        Student George = new Student("George");
        George.addGrade(86);
        George.addGrade(75);
        George.addGrade(90);
        George.Attendance("2020-08-10", "P");
        George.Attendance("2020-08-11", "P");
        George.Attendance("2020-08-12", "P");
        George.Attendance("2020-08-13", "P");
        George.Attendance("2020-08-14", "P");
        George.Attendance("2020-08-15", "P");


        students.put("Best.of.Github", Bob);
        students.put("The.Muffin.Man", Joe);
        students.put("Truest.Of.True.Github.Usernames", Sam);
        students.put("Mr.Meseeks", George);


        String student = "";
        String choice = "";
        boolean StudentList = false;
        //Scanner function for User
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome!\n");

        do {
            do {
                System.out.println("usernames: \n");


                for (String stu : students.keySet()) {
                    System.out.println(stu);
                }

                System.out.println("\nWhich Sudent's grades would you like to view?");
                student = input.nextLine();


                if (student.equalsIgnoreCase("All")) {
                    System.out.println("\nName            | GitHub username  |   GPA                Attendance");

                    double GPA = 0;

                    for (String stu : students.keySet()) {
                        Student s = students.get(stu);

                        System.out.printf("%-10s   | %-15s | %-5s | %s%%%n", s.getName(), stu, s.getGradeAverage(), s.attendanceAvg());


                        GPA += s.getGradeAverage();
                    }


                    System.out.println("Overall GPA: " + GPA / students.size());
                    StudentList = true;
                } else if (!students.containsKey(student)) {
                    System.out.println("Sorry, no student found with the Github username of \"" + student + ".\"");
                    System.out.println();

                    StudentList = false;
                } else {
                    Student s = students.get(student);
                    System.out.println("Name: " + s.getName() + " - Github UserName: " + student);

                    System.out.println("Grades: ");
                    for (int grade : s.getGrades()) {
                        System.out.println("\t" + grade);

                    }
                    System.out.println("Current Average: " + s.getGradeAverage());
                    System.out.println("Attendance: " + s.attendanceAvg() + "%");

                    System.out.println("Days Absent: ");
                    for (String a : s.getAttendance().keySet()) {
                        if (s.getAttendance().get(a).equals("A")) {
                            System.out.println("\t" + a);
                        }
                    }
                    StudentList = true;
                }
            } while (!StudentList);
            System.out.println();
            System.out.println("Would you like to see another student? [Y/N] ");
            choice = input.nextLine();
            System.out.println();
            if (choice.equalsIgnoreCase("n")) {
                System.out.println("Thank you, see you next time");
            }
        } while (choice.equalsIgnoreCase("y"));

    }
}
//    Create at least 4 student objects with at least 3 grades each, and add them to the map.