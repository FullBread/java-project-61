package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    private static final int COUNT_OF_QUESTIONS = 3;
    private static final int OPERATORS = 3;
    private static final int UPPER_BOUND_FIRST = 46;
    private static final int UPPER_BOUND_SECOND = 26;

    public static void calc() {
        String gameRules = "What is the result of the expression?";
        Random random = new Random();
        String[][] calcArray = new String[COUNT_OF_QUESTIONS][2];
        for (var i = 0; i < COUNT_OF_QUESTIONS; i++) {
            var numberOne = random.nextInt(UPPER_BOUND_FIRST);
            var numberTwo = random.nextInt(UPPER_BOUND_SECOND);
            var operator = random.nextInt(OPERATORS);
            switch (operator) {
                case 0 -> {
                    calcArray[i][0] = numberOne + " + " + numberTwo;
                    calcArray[i][1] = String.valueOf(numberOne + numberTwo);
                }
                case 1 -> {
                    calcArray[i][0] = numberOne + " - " + numberTwo;
                    calcArray[i][1] = String.valueOf(numberOne - numberTwo);
                }
                default -> {
                    calcArray[i][0] = numberOne + " * " + numberTwo;
                    calcArray[i][1] = String.valueOf(numberOne * numberTwo);
                }
            }
        }
        Engine.correctOrNot(gameRules, calcArray);
    }
}
