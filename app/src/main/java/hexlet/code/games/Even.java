package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Even {

    @SuppressWarnings("checkstyle:NeedBraces")
    public static void even() {
        Scanner answer = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = answer.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random random = new Random();
        var count = 0;
        var correctAnswer = "";
        while (count < 3) {
            int randomNumber = random.nextInt(100);
            if (randomNumber % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            System.out.println("Question: " + randomNumber);
            String userAnswer = answer.next();
            System.out.println("Your answer: " + userAnswer);
            if (correctAnswer.equals(userAnswer)) {
                count += 1;
                System.out.println("Correct!");
                if (count == 3) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.", userAnswer, correctAnswer);
                System.out.println("\n Let's try again, " + userName + "!");
                break;
            }
        }
    }
}
