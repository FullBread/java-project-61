package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Even {
    private static final int COUNT_OF_QUESTIONS = 3;
    private static final int UPPER_BOUND = 100;

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void run() {
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] evenArray = new String[COUNT_OF_QUESTIONS][2];
        for (var i = 0; i < COUNT_OF_QUESTIONS; i++) {
            int number = Utils.getRandomNumber(0, UPPER_BOUND);
            evenArray[i][0] = String.valueOf(number);
            evenArray[i][1] = isEven(number) ? "yes" : "no";
        }
        Engine.play(gameRules, evenArray);
    }
}
