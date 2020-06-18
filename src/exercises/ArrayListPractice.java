package exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> numToSum = new ArrayList<Integer>();
        numToSum.add(1);
        numToSum.add(2);
        numToSum.add(3);
        numToSum.add(4);
        numToSum.add(5);
        numToSum.add(6);
        numToSum.add(7);
        numToSum.add(8);
        numToSum.add(9);
        numToSum.add(10);

        Integer result = sumEvenNumbers(numToSum);
        System.out.println(result);

        String paragraph = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        Scanner input = new Scanner(System.in);
        System.out.println("From the text above, please type a number so you can find all words with " +
                "that amount of characters: ");

        findWords(paragraph, input.nextInt());
    }
    public static Integer sumEvenNumbers(ArrayList<Integer> numbers) {

        Integer suma = 0  ;
        for(Integer number : numbers){
            if(number % 2 == 0){
                suma = suma + number ;
            }
        }
        return suma ;
    }

    public static void findWords(String words, Integer letterCount){

        String[] sentences = words.split(" ");

        for(String sentence : sentences){
            if(sentence.length() == letterCount){
                System.out.println(sentence);
            }
        }
    }
}
