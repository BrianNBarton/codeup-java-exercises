package movies;
import java.util.Scanner;

public class Movie {
    private String name;
    private String category;

//setters and getters

 public void setName(String name) {
     this.name = name; }




    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return this.category;
    }

    public Movie(String name, String category) {
     this.name = name;
    this.category = category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
//It should have private fields for name and category,


    // and a constructor that sets both of these.
    // Create methods to access these properties and change them (getters and setters).
}
