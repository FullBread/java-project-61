package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {

    public static void progression() {
        Engine.greetings();
        System.out.println("What number is missing in the progression?");
        Random random = new Random();
        String[] progressionArray = new String[3];
        String[] answerArray = new String[3];
        for (var i = 0; i < 3; i++) {
            var firstNumber = random.nextInt(26);
            var length = random.nextInt(5, 11);
            var missing = random.nextInt(2, 5);
            var step = random.nextInt(2, 30);
            progressionArray[i] = "";
            for (var j = 0; j < length; j++) {
                if (j == missing) {
                    progressionArray[i] = progressionArray[i] + " .. ";
                } else {
                    progressionArray[i] = progressionArray[i] + " " + (firstNumber + step * j) + " ";
                }
            }
            answerArray[i] = String.valueOf(firstNumber + (step * missing));
        }
        Engine.correctOrNot(progressionArray, answerArray);
    }
}
