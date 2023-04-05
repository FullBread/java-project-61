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
        String gameRules = "What number is missing in the progression?";
        Random random = new Random();

        String[][] progressionArray = new String[COUNT_OF_QUESTIONS][2];
        for (var i = 0; i < COUNT_OF_QUESTIONS; i++) {
            var firstNumber = random.nextInt(FIRST_NUMBER_UPPER_BOUND);
            var length = random.nextInt(LENGTH_LOWER_BOUND, LENGTH_UPPER_BOUND);
            var missingIndex = random.nextInt(MISSING_NUMBER_LOWER_BOUND, MISSING_NUMBER_UPPER_BOUND);
            var step = random.nextInt(STEP_LOWER_BOUND, STEP_UPPER_BOUND);
            progressionArray[i][0] = "";
            StringBuilder question = new StringBuilder();
            for (var j = 0; j < length; j++) {
                if (j == missingIndex) {
                    progressionArray[i][0] = String.valueOf(question.append(".. "));
                } else {
                    question.append((firstNumber + step * j));
                    question.append(" ");
                    progressionArray[i][0] = String.valueOf(question);
                }
            }
            progressionArray[i][1] = String.valueOf(firstNumber + (step * missingIndex));
        }
        Engine.play(gameRules, progressionArray);
    }
}
