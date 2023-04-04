package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int COUNT_OF_QUESTIONS = 3;
    private static final int COUNT_OF_ANSWERS = 3;
    private static String userName = "";

//    public static void greetings() {
//        Scanner answer = new Scanner(System.in);
//        System.out.println("Welcome to the Brain Games!");
//        System.out.print("May I have your name? ");
//        userName = answer.next();
//        System.out.println("Hello, " + userName + "!");
//    }
    public static void correctOrNot(String gameRules, String[][] questionAndAnswer) {
        Scanner answer = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = answer.next();
        System.out.println("Hello, " + userName + "!");
        System.out.print(gameRules);
        var count = 0;
        for (var i = 0; i < COUNT_OF_QUESTIONS; i++) {
            System.out.println("Question: " + questionAndAnswer[i][0]);
            String userAnswer = answer.next();
            System.out.println("Your answer: " + userAnswer);
            if (questionAndAnswer[i][0].equals(userAnswer)) {
                System.out.println("Correct!");
                count += 1;
                if (count == COUNT_OF_ANSWERS) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'."
                        + "\n Let's try again, %s!", userAnswer, questionAndAnswer[i][1], userName);
                break;
            }
        }
    }
}
