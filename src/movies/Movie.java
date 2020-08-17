package movies;
import java.util.Scanner;

public class Movie {
    private String name;
    private String category;

//setters and getters

 public void setName(String name) {
     this.name = name; }

    public String getName() {
        return name;
    }

    public String setCategory(){
      this.name = setCategory();
    }

    public String getCategory() {
        return category;
    }

    public Movie(String name, String category) {
     setName(name);
     setCategory(category);
    }

    //It should have private fields for name and category,


    // and a constructor that sets both of these.
    // Create methods to access these properties and change them (getters and setters).
}
