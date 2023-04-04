package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;
public class App {
    private static final int USER_CHOICE_1 = 1;
    private static final int USER_CHOICE_2 = 2;
    private static final int USER_CHOICE_3 = 3;
    private static final int USER_CHOICE_4 = 4;
    private static final int USER_CHOICE_5 = 5;
    private static final int USER_CHOICE_6 = 6;
    public static void main(String[] args) {
        Scanner userAnswer = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        System.out.print("Your choice: ");
        int answer = userAnswer.nextInt();
        switch (answer) {
            case 0 -> System.out.println("Goodbye :(");
            case USER_CHOICE_1 -> Cli.greetings();
            case USER_CHOICE_2 -> Even.even();
            case USER_CHOICE_3 -> Calc.calc();
            case USER_CHOICE_4 -> GCD.gcd();
            case USER_CHOICE_5 -> Progression.progression();
            case USER_CHOICE_6 -> Prime.prime();
            default -> System.out.println("You entered an invalid value, let's try again.");
        }
    }
}
