package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {

    public static void calc() {
        Engine.greetings();
        System.out.println("What is the result of the expression?");
        Random random = new Random();
        String[] calcArray = new String[3];
        String[] answerArray = new String[3];
        for (var i = 0; i < 3; i++) {
            var numberOne = random.nextInt(26);
            var numberTwo = random.nextInt(26);
            var operator = random.nextInt(3);
            switch (operator) {
                case 0 -> {
                    calcArray[i] = numberOne + " + " + numberTwo;
                    answerArray[i] = String.valueOf(numberOne + numberTwo);
                }
                case 1 -> {
                    calcArray[i] = numberOne + " - " + numberTwo;
                    answerArray[i] = String.valueOf(numberOne - numberTwo);
                }
                default -> {
                    calcArray[i] = numberOne + " * " + numberTwo;
                    answerArray[i] = String.valueOf(numberOne * numberTwo);
                }
            }
        }
        Engine.correctOrNot(calcArray, answerArray);
    }
}
