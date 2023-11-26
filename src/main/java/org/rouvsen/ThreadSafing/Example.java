package org.rouvsen.ThreadSafing;

public enum Example {
    exe1(123),
    exe2(456),
    exe3(789);

    final int value;

    Example(int val) {
        this.value = val;
    }

    public static void main(String[] args) {
        System.out.println(Example.exe1); // String name of Enum
        System.out.println(Example.exe1.value); // Value of Enum
    }
}
