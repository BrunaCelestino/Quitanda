package br.com.bruna.quitanda.util;

import java.util.Random;

public class GenerateRandoms {

    public static int generateRandomNumber(int number) {
        Random random = new Random();
        int upperbound = number;
        int randomNumber = random.nextInt(upperbound);

        return randomNumber;
    }

}
