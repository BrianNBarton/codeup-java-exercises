import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

//        int[] numbers = {1, 2, 3, 4, 5};
//        for (int number : numbers) {
//            System.out.println(number);
//        }

        //gives location in memory

        String[] Person = {"Austin", "Binjita", "Ryan"};
        for (String person : Person) {
            System.out.println(person);


        }
        Person[] addingPerson = new Person[]{new Person("Tristin")};
        addingPerson = addPerson(addingPerson, new Person( "Nancy"));
        addingPerson = addPerson(addingPerson, new Person("Eddy"));

        for(Person p: addingPerson){
            System.out.println(p.getName());
            
        }
        }


    public static Person[] addPerson(Person[] group, Person person) {
        Person[] result = new Person[group.length + 1];
        System.arraycopy(group, 0, result, 0, group.length);
        result[group.length] = person;
        return result;
    }

    }
