package hexlet.code;

import hexlet.code.games.Even;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner userAnswer = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n 1 - Even\n 0 - Exit");
        int answer = userAnswer.nextInt();
        switch (answer) {
            case 0 -> System.out.println("Goodbye :(");
            case 1 -> {
                System.out.println("Your choice: " + answer);
                Even.even();
            }
            default -> System.out.println("You entered an invalid value, let's try again.");
        }
    }
}
