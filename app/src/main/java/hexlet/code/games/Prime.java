package hexlet.code.games;

import hexlet.code.Engine;

import hexlet.code.Utils;
import org.apache.commons.math3.primes.Primes;

public class Prime {
    private static final int COUNT_OF_QUESTIONS = 3;
    private static final int UPPER_BOUND = 120;

    public static void run() {
        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] primeArray = new String[COUNT_OF_QUESTIONS][2];
        for (var i = 0; i < COUNT_OF_QUESTIONS; i++) {
            var number = Utils.getRandomNumber(0, UPPER_BOUND);
            primeArray[i][0] = String.valueOf(number);
            boolean prime = Primes.isPrime(number);
            primeArray[i][1] = prime ? "yes" : "no";
        }
        Engine.play(gameRules, primeArray);
    }
}
