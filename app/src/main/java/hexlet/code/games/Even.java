package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    private static final int COUNT_OF_QUESTIONS = 3;
    private static final int UPPER_BOUND = 100;


    @SuppressWarnings("checkstyle:NeedBraces")
    public static void even() {
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Random random = new Random();
        String[][] evenArray = new String[COUNT_OF_QUESTIONS][2];
        for (var i = 0; i < COUNT_OF_QUESTIONS; i++) {
            evenArray[i][0] = String.valueOf(random.nextInt(UPPER_BOUND));
            if (Integer.parseInt(evenArray[i][0]) % 2 == 0) {
                evenArray[i][1] = "yes";
            } else {
                evenArray[i][1] = "no";
            }
        }
        Engine.correctOrNot(gameRules, evenArray);
    }
}
