package org.rouvsen.UtilityClass;

//it should be final class (against inheritance)
public final class ExampleUtil {

    private ExampleUtil() {
        throw new IllegalStateException("You don't have access to private constructor");
        //why we throw RuntimeException?
        //because I have access to Constructor
        //when I use static nested class or static function
    }

//    private static void foo() {
//        new ExampleUtil(); //yeah I can use, but it will throw Exception..
//    }

    //All the fields and methods will be static (final)

    public int getPagesOfBook(String name) {
        return 16;
    }

    public String getAuthorOfBook(String bookName) {
        return "Alberto Nicole";
    }

}
