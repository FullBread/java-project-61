package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;
public class App {
    private static final int EXIT = 0;
    private static final int GREET = 1;
    private static final int EVEN_GAME = 2;
    private static final int CALC_GAME = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION_GAME = 5;
    private static final int PRIME_GAME = 6;

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
            case EXIT -> System.out.println("Goodbye :(");
            case GREET -> Cli.greetings();
            case EVEN_GAME -> Even.run();
            case CALC_GAME -> Calc.run();
            case GCD_GAME -> GCD.run();
            case PROGRESSION_GAME -> Progression.run();
            case PRIME_GAME -> Prime.run();
            default -> System.out.println("You entered an invalid value.");
        }
    }
}
