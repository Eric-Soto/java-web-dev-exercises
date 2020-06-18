package exercises;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] words = new int[]{1, 1, 2, 3, 5, 8};
        String paragraph = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        for(int i : words){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        String[] sentences = paragraph.split("\\.");

        for (String i : sentences){
            System.out.println(i);
        }

    }
}
