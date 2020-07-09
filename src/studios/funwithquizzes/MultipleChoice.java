package studios.funwithquizzes;

public class MultipleChoice extends Question {


    public MultipleChoice(String askedQuestion,  int rightAnswer) {
        super(askedQuestion, rightAnswer);
    }

    @Override
    public Boolean questionResult() {
        if(getUserAnswer() == getRightAnswer()){
            return true;
        }
        else{
            return false;
        }
    }


}
