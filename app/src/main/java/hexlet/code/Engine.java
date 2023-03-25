package hexlet.code;

import java.util.Scanner;

public class Engine {
    static String userName = "";

    public static void greetings() {
        Scanner answer = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = answer.next();
        System.out.println("Hello, " + userName + "!");
    }
    public static void correctOrNot(String[] question, String[] correctAnswer) {
        var count = 0;
        for (var i = 0; i < 3; i++) {
            Scanner answer = new Scanner(System.in);
            System.out.println("Question: " + question[i]);
            String userAnswer = answer.next();
            System.out.println("Your answer: " + userAnswer);
            if (correctAnswer[i].equals(userAnswer)) {
                System.out.println("Correct!");
                count += 1;
                if (count == 3) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'."
                        + "\n Let's try again, %s!", userAnswer, correctAnswer[i], userName);
                break;
            }
        }
    }
}
