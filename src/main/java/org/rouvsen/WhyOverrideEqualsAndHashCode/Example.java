package org.rouvsen.WhyOverrideEqualsAndHashCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Example {

    private String name;
    private String surname;
    private int age;

    public Example(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return age == example.age &&
                Objects.equals(name, example.name) &&
                Objects.equals(surname, example.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    public static void main(String[] args) {

        Example example =
                new Example("name-test", "surname-test", 11);
                //different object

        Map<Example, String> map = new HashMap<>();
        map.put(example, "Result");

        System.out.println(
           map.get(
                   new Example("name-test", "surname-test", 11)
                   //different object
           )
        );

        // How we can get -> Result value with new Example Object
        // Because, Example Objects lives in the same Bucket
        // They have same hashCodes (looks fields multiply logic), and
        // equality logic see that all of Object's field values are same

    }
}
