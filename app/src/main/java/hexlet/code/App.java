package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner userAnswer = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                1 - Even
                2 - Calc
                3 - GCD
                4 - Progression
                0 - Exit""");
        System.out.print("Your choice: ");
        int answer = userAnswer.nextInt();
        switch (answer) {
            case 0 -> System.out.println("Goodbye :(");
            case 1 -> Engine.greetings();
            case 2 -> Even.even();
            case 3 -> Calc.calc();
            case 4 -> GCD.gcd();
            case 5 -> Progression.progression();
            default -> System.out.println("You entered an invalid value, let's try again.");
        }
    }
}
