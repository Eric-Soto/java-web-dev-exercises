package studios.funwithquizzes;

import java.util.Scanner;

public class QuizRunner {

    public static void main(String[] args) {
        MultipleChoice real = new MultipleChoice("1 + 1 equals: \n1) 2\n2) 4\n3) 7 ", 1);
        Scanner input;
        input = new Scanner(System.in);
        System.out.println(real.getAskedQuestion());
        real.setUserAnswer(input.nextInt());
        System.out.println(real.questionResult());
    }
}