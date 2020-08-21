package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> studentGrades = new HashMap<>();



        studentGrades.put("Best.UserName", new ArrayList<>());
        studentGrades.get("Best.UserName").add((Integer) 88);
        studentGrades.get("Best.UserName").add((Integer) 92);
        studentGrades.get("Best.UserName").add((Integer) 85);
        studentGrades.get("Best.UserName").add((Integer) 80);
        studentGrades.get("Best.UserName").add((Integer) 95);
        System.out.println(studentGrades.get("Best.UserName"));

        studentGrades.put("Jessica.Nigri.Sogood", new ArrayList<>());
        studentGrades.get("Jessica.Nigri.Sogood").add((Integer) 99);
        studentGrades.get("Jessica.Nigri.Sogood").add((Integer) 98);
        studentGrades.get("Jessica.Nigri.Sogood").add((Integer) 99);
        studentGrades.get("Jessica.Nigri.Sogood").add((Integer) 100);
        studentGrades.get("Jessica.Nigri.Sogood").add((Integer) 95);
        System.out.println(studentGrades.get("Jessica.Nigri.Sogood"));

        studentGrades.put("That.Rockin.gitProfile", new ArrayList<>());
        studentGrades.get("That.Rockin.gitProfile").add((Integer) 79);
        studentGrades.get("That.Rockin.gitProfile").add((Integer) 98);
        studentGrades.get("That.Rockin.gitProfile").add((Integer) 99);
        studentGrades.get("That.Rockin.gitProfile").add((Integer) 100);
        studentGrades.get("That.Rockin.gitProfile").add((Integer) 95);
        System.out.println(studentGrades.get("That.Rockin.gitProfile"));


        studentGrades.put("the.Muffin.Man.", new ArrayList<>());
        studentGrades.get("the.Muffin.Man.").add((Integer) 89);
        studentGrades.get("the.Muffin.Man.").add((Integer) 88);
        studentGrades.get("the.Muffin.Man.").add((Integer) 89);
        studentGrades.get("the.Muffin.Man.").add((Integer) 90);
        studentGrades.get("the.Muffin.Man.").add((Integer) 85);
        System.out.println(studentGrades.get("the.Muffin.Man"));
    }
}
// Inside the main method,
//        create a HashMap named students.
//        It should have keys that are strings that represent github usernames,
//        and values that are Student objects.
//        Create at least 4 student objects with at least 3 grades each, and add them to the map.