package hexlet.code.games;

import hexlet.code.Engine;

import org.apache.commons.math3.primes.Primes;
import java.util.Random;

public class Prime {
    private static final int COUNT_OF_QUESTIONS = 3;
    private static final int UPPER_BOUND = 120;

    public static void prime() {
        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Random random = new Random();
        String[][] primeArray = new String[COUNT_OF_QUESTIONS][2];
        for (var i = 0; i < COUNT_OF_QUESTIONS; i++) {
            primeArray[i][0] = String.valueOf(random.nextInt(UPPER_BOUND));
            if (Primes.isPrime(Integer.parseInt(primeArray[i][0]))) {
                primeArray[i][1] = "yes";
            } else {
                primeArray[i][1] = "no";
            }
        }
        Engine.correctOrNot(gameRules, primeArray);
    }
}
