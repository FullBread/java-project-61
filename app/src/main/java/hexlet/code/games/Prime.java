package hexlet.code.games;

import hexlet.code.Engine;

import org.apache.commons.math3.primes.Primes;
import java.util.Random;

public class Prime {
    private static final int COUNT_OF_QUESTIONS = 3;
    private static final int UPPER_BOUND = 120;

    public static void prime() {
        Engine.greetings();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Random random = new Random();
        String[] primeArray = new String[COUNT_OF_QUESTIONS];
        String[] answerArray = new String[COUNT_OF_QUESTIONS];
        for (var i = 0; i < COUNT_OF_QUESTIONS; i++) {
            primeArray[i] = String.valueOf(random.nextInt(UPPER_BOUND));
            if (Primes.isPrime(Integer.parseInt(primeArray[i]))) {
                answerArray[i] = "yes";
            } else {
                answerArray[i] = "no";
            }
        }
        Engine.correctOrNot(primeArray, answerArray);
    }
}
