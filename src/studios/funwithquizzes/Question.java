package studios.funwithquizzes;

public abstract class Question {


    private String askedQuestion;
    private int userAnswer;
    private int rightAnswer;

    public Question(String askedQuestion, int rightAnswer) {
        this.askedQuestion = askedQuestion;

        this.rightAnswer = rightAnswer;
    }

//private Boolean rightOrWrong;

    public String getAskedQuestion() {
        return askedQuestion;
    }

    public void setAskedQuestion(String askedQuestion) {
        this.askedQuestion = askedQuestion;
    }

    public int getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(int userAnswer) {
        this.userAnswer = userAnswer;
    }

    public int getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(int rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public abstract Boolean questionResult();

    }


