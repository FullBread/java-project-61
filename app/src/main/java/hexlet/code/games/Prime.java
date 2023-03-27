package hexlet.code.games;

import hexlet.code.Engine;

import org.apache.commons.math3.primes.Primes;
import java.util.Random;

public class Prime {

    public static void prime() {
        Engine.greetings();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Random random = new Random();
        String[] primeArray = new String[3];
        String[] answerArray = new String[3];
        for (var i = 0; i < 3; i++) {
            primeArray[i] = String.valueOf(random.nextInt(120));
            if (Primes.isPrime(Integer.parseInt(primeArray[i]))) {
                answerArray[i] = "yes";
            } else {
                answerArray[i] = "no";
            }
        }
        Engine.correctOrNot(primeArray, answerArray);
    }
}
