package org.rouvsen.StringTrickyCase;

public class Example {
    public static void main(String[] args) {

        String word1 = new String("example");
        String word2 = "example";
        String word3 = "example";

        System.out.println("**********");
        System.out.println( word1 == word2 );//false
        System.out.println( word1 == word3 );//false
        System.out.println( word2 == word3 );//true

        System.out.println("**********");
        System.out.println( word1.hashCode() );//same hashCode, but used 'new' keyword
        System.out.println( word2.hashCode() );//same hashCode
        System.out.println( word3.hashCode() );//same hashCode
        //because contents are same for all the strings: example

        System.out.println("**********");
        System.out.println("hashCode: " + "is it have hashCode?".hashCode());//yes
    }
}
