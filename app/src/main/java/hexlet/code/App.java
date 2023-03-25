package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner userAnswer = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Even
                2 - Calc
                3 - GCD
                0 - Exit""");
        System.out.print("Your choice: ");
        int answer = userAnswer.nextInt();
        switch (answer) {
            case 0 -> System.out.println("Goodbye :(");
            case 1 -> Even.even();
            case 2 -> Calc.calc();
            case 3 -> GCD.gcd();
            default -> System.out.println("You entered an invalid value, let's try again.");
        }
    }
}
