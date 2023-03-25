package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {

    public static void gcd() {
        Engine.greetings();
        System.out.println("Find the greatest common divisor of given numbers.");
        Random random = new Random();
        String[] gcdArray = new String[3];
        String[] answerArray = new String[3];
        for (var i = 0; i < 3; i++) {
            var numberOne = random.nextInt(40, 260);
            var numberTwo = random.nextInt(40, 260);
            gcdArray[i] = numberOne + " " + numberTwo;
            while (numberTwo != 0) {
                int temp = numberTwo;
                numberTwo = numberOne % numberTwo;
                numberOne = temp;
            }
            answerArray[i] = String.valueOf(numberOne);
        }
        Engine.correctOrNot(gcdArray, answerArray);
    }
}
