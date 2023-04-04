package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    private static final int LOWER_BOUND = 40;
    private static final int UPPER_BOUND = 260;
    private static final int COUNT_OF_QUESTIONS = 3;

    private static String answerForGcd(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }
        return String.valueOf(firstNumber);
    }

    public static void gcd() {
        String gameRules = "Find the greatest common divisor of given numbers.";
        Random random = new Random();
        String[][] gcdArray = new String[COUNT_OF_QUESTIONS][2];
        for (var i = 0; i < COUNT_OF_QUESTIONS; i++) {
            var numberOne = random.nextInt(LOWER_BOUND, UPPER_BOUND);
            var numberTwo = random.nextInt(LOWER_BOUND, UPPER_BOUND);
            gcdArray[i][0] = numberOne + " " + numberTwo;
            gcdArray[i][1] = answerForGcd(numberOne, numberTwo);
        }
        Engine.play(gameRules, gcdArray);
    }
}
