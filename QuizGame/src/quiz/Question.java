package quiz;

public interface Question {
    String getQuestion();
    boolean isCorrect(int answer);
}