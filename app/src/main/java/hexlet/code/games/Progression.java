package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    private static final int COUNT_OF_QUESTIONS = 3;
    private static final int FIRST_NUMBER_UPPER_BOUND = 26;
    private static final int LENGTH_LOWER_BOUND = 6;
    private static final int LENGTH_UPPER_BOUND = 11;
    private static final int MISSING_NUMBER_LOWER_BOUND = 2;
    private static final int MISSING_NUMBER_UPPER_BOUND = 5;
    private static final int STEP_LOWER_BOUND = 2;
    private static final int STEP_UPPER_BOUND = 30;


    public static void progression() {
        Engine.greetings();
        System.out.println("What number is missing in the progression?");
        Random random = new Random();
        String[] progressionArray = new String[COUNT_OF_QUESTIONS];
        String[] answerArray = new String[COUNT_OF_QUESTIONS];
        for (var i = 0; i < COUNT_OF_QUESTIONS; i++) {
            var firstNumber = random.nextInt(FIRST_NUMBER_UPPER_BOUND);
            var length = random.nextInt(LENGTH_LOWER_BOUND, LENGTH_UPPER_BOUND);
            var missing = random.nextInt(MISSING_NUMBER_LOWER_BOUND, MISSING_NUMBER_UPPER_BOUND);
            var step = random.nextInt(STEP_LOWER_BOUND, STEP_UPPER_BOUND);
            progressionArray[i] = "";
            for (var j = 0; j < length; j++) {
                if (j == missing) {
                    progressionArray[i] = progressionArray[i] + ".. ";
                } else {
                    progressionArray[i] = progressionArray[i] + (firstNumber + step * j) + " ";
                }
            }
            answerArray[i] = String.valueOf(firstNumber + (step * missing));
        }
        Engine.correctOrNot(progressionArray, answerArray);
    }
}
