package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {

    @SuppressWarnings("checkstyle:NeedBraces")
    public static void even() {
        Engine.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random random = new Random();
        String[] evenArray = new String[3];
        String[] answerEven = new String[3];
        for (var i = 0; i < 3; i++) {
            evenArray[i] = String.valueOf(random.nextInt(100));
            if (Integer.parseInt(evenArray[i]) % 2 == 0) {
                answerEven[i] = "yes";
            } else {
                answerEven[i] = "no";
            }
        }
        Engine.correctOrNot(evenArray, answerEven);
    }
}
