package Task8;

import java.util.*;

class Question {
    String questionText;
    String[] options;
    int correctAnswer;

    public Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Question> questions = new ArrayList<>();


        questions.add(new Question(
                "What is the capital of France?",
                new String[]{"1. Berlin", "2. Paris", "3. Madrid", "4. Rome"},
                2
        ));
        questions.add(new Question(
                "Which language is used for Android development?",
                new String[]{"1. Python", "2. Swift", "3. Java", "4. PHP"},
                3
        ));
        questions.add(new Question(
                "Who developed Java?",
                new String[]{"1. James Gosling", "2. Dennis Ritchie", "3. Bjarne Stroustrup", "4. Guido van Rossum"},
                1
        ));

        int score = 0;


        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("\nQ" + (i + 1) + ": " + q.questionText);

            for (String option : q.options) {
                System.out.println(option);
            }

            System.out.print("Your answer (1-4): ");
            int answer = scanner.nextInt();

            if (answer == q.correctAnswer) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + q.correctAnswer);
            }
        }

        System.out.println("\n Quiz Over! Your Score: " + score + "/" + questions.size());

        scanner.close();
    }
}

