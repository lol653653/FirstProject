package newpackage;

import java.util.ArrayList;
import java.util.List;

public class Person4Test {

    public static void main(String[] args) {
        ArrayList<Person4> people = new ArrayList<Person4>();
        for (int i = 0; i < 1000; i++) {

            Person4 person = new Person4(NameUtils.randomFirstName(), NameUtils.randomLastName());
            people.add(person);
        }
// Person4[] people = new Person4[20];

        for (Person4 person : people) {
            System.out.println("Person's full name: "
                    + person.getFullName());
        }
    }
}
