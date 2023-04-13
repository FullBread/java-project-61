package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    private static final int COUNT_OF_QUESTIONS = 3;
    private static final int UPPER_BOUND = 100;

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void even() {
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Random random = new Random();
        String[][] evenArray = new String[COUNT_OF_QUESTIONS][2];
        for (var i = 0; i < COUNT_OF_QUESTIONS; i++) {
            evenArray[i][0] = String.valueOf(random.nextInt(UPPER_BOUND));
            evenArray[i][1] = isEven(Integer.parseInt(evenArray[i][0])) ? "yes" : "no";
        }
        Engine.play(gameRules, evenArray);
    }
}
