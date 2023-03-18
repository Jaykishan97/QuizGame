package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import questions.MultipleChoiceQuestion;
//import questions.Question;
import questions.TrueFalseQuestion;
import utils.InputUtils;

public class QuizGame {
    public static void main(String[] args) {
    	List<Question> questions = new ArrayList<>();
        questions.add(new TrueFalseQuestion("Is the sky blue?", true));
        questions.add(new MultipleChoiceQuestion("What is the capital of France?",
                new String[] { "Paris", "Madrid", "Rome", "Berlin" }, 0));
        questions.add(new TrueFalseQuestion("Is the earth flat?", false));
        questions.add(new MultipleChoiceQuestion("What is the largest planet in our solar system?",
                new String[] { "Venus", "Jupiter", "Mars", "Mercury" }, 1));
        questions.add(new TrueFalseQuestion("Is the Great Wall of China visible from space?", false));
        questions.add(new MultipleChoiceQuestion("What is the smallest country in the world?",
                new String[] { "Monaco", "San Marino", "Vatican City", "Liechtenstein" }, 2));
        questions.add(new TrueFalseQuestion("Is the tomato a fruit?", true));
        questions.add(new MultipleChoiceQuestion("What is the largest mammal on earth?",
                new String[] { "Elephant", "Giraffe", "Hippopotamus", "Blue Whale" }, 3));
        questions.add(new TrueFalseQuestion("Is the speed of light faster than the speed of sound?", true));
        questions.add(new TrueFalseQuestion("Is Mount Everest the highest mountain in the world?", true));
        
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question.getQuestion());
            int answer = InputUtils.readInt(scanner);
            if (question.isCorrect(answer)) {
                score++;
            }
        }
        scanner.close();
        
        System.out.println("Your score: " + score + "/" + questions.size());
    }
}
