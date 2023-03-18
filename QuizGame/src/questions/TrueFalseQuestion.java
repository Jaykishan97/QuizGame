package questions;

import quiz.Question;

public class TrueFalseQuestion implements Question {
    private String question;
    private boolean answer;
    
    public TrueFalseQuestion(String question, boolean answer) {
        this.question = question;
        this.answer = answer;
    }
    
    @Override
    public String getQuestion() {
        return question + " (true or false)";
    }

    @Override
    public boolean isCorrect(int answer) {
        return (answer == 0 && this.answer) || (answer == 1 && !this.answer);
    }
}
