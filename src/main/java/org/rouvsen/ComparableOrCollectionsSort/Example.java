package org.rouvsen.ComparableOrCollectionsSort;

import java.util.*;

public class Example implements Comparable<Example> {

    private String name;
    private int age;

    public Example(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return age == example.age && Objects.equals(name, example.name);
    }

    @Override
    public String toString() {
        return "Example{name='%s', age=%d}"
                .formatted(name, age);
    }

    public static void main(String[] args) {
        Set<Example> examples = new HashSet<>();
        examples.add(new Example("test1", 15));
        examples.add(new Example("test2", 20));
        examples.add(new Example("test3", 35));
        System.out.println(examples);

        //Convert to ArrayList and use Collections.sort()
        List<Example> list = new ArrayList<>(examples);
        Collections.sort(list);
        System.out.println(list);

        //You can use TreeSet instead of HashSet
        //because HashSet has unordered elements..
        examples = new TreeSet<>();
        examples.add(new Example("test1", 15));
        examples.add(new Example("test2", 20));
        examples.add(new Example("test3", 35));
        System.out.println(examples);


    }

    @Override
    public int compareTo(Example next) {

        int ageDiff = this.age - next.age;

        if(ageDiff != 0) {
            return ageDiff;
        }

        return 0;
    }
}
