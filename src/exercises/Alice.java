package exercises;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args){

        String AliceBody = "Alice was beginning to get very tired of sitting by her " +
                "sister on the bank, and of having nothing to do: once or twice she had peeped into the book" +
                " her sister was reading, but it had no pictures or conversations in it, 'and what is the use" +
                " of a book,' thought Alice 'without pictures or conversation?'" ;
        Scanner input = new Scanner(System.in);
        System.out.println("Search for a term in Alice in Wonderland: ");
        String searchTerm = input.nextLine();
        String uCaseSearchTerm = searchTerm.toUpperCase();
        String uCaseAliceBody = AliceBody.toUpperCase();
        System.out.println(uCaseAliceBody.contains(uCaseSearchTerm));
        System.out.println("the word index is " + uCaseAliceBody.indexOf(uCaseSearchTerm) + " and its length is " + uCaseSearchTerm.length());
        String resultRemove = AliceBody.replaceAll(searchTerm, "");
        String cleanResult = resultRemove.replaceAll("  ", " ");

        System.out.println(cleanResult);



    }



}