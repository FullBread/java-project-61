package hexlet.code.games;

import java.util.Random;

public class Utils {
    public static int getRandomNumber(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(lowerBound, upperBound);
    }
}
