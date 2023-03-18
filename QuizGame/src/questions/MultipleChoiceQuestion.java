package questions;

import quiz.Question;

public class MultipleChoiceQuestion implements Question {
    private String question;
    private String[] choices;
    private int answer;
    
    public MultipleChoiceQuestion(String question, String[] choices, int answer) {
        this.question = question;
        this.choices = choices;
        this.answer = answer;
    }
    
    @Override
    public String getQuestion() {
        StringBuilder sb = new StringBuilder(question);
        sb.append(" (choose one):");
        for (int i = 0; i < choices.length; i++) {
            sb.append("\n").append(i + 1).append(". ").append(choices[i]);
        }
        return sb.toString();
    }

    @Override
    public boolean isCorrect(int answer) {
        return answer == this.answer + 1;
    }
}
