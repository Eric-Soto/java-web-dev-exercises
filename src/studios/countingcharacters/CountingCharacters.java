package studios.countingcharacters;


import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {

    public static void main(String[] args){
        String mainText = "If the product of two terms is zero then common sense says " +
                "at least one of the two terms has to be zero to start with. So if you " +
                "move all the terms over to one side, you can put the quadratics into a " +
                "form that can be factored allowing that side of the equation to equal " +
                "zero. Once you’ve done that, it’s pretty straightforward from there.";
        HashMap<String, Integer> letters = new HashMap<>();
        //ArrayList<String> letters = new ArrayList<>();
        Integer testCount = 0 ;

        String upperText = mainText.toUpperCase();
        String[] testSplits = upperText.split("");

        for (String testSplit : testSplits){
            if(letters.containsKey(testSplit) == false && testSplit.matches("[A-z0-9]")){
                letters.put(testSplit, 0);
            }
            else if(letters.containsKey(testSplit) == true && testSplit.matches("[A-z0-9]")){
                letters.put(testSplit, letters.get(testSplit) + 1);
            }
        }

        for(String letter : letters.keySet()){
            System.out.println(letter + ": " + letters.get(letter));
        }

        }


    }

