package lv.Javaguru.homework.lesson2;

import java.util.Random;

public class RandomNumbersServiceTest {
    public static void main(String[] args) {

        Random randomGenerator = new Random();
        int randomNumberOne = randomGenerator.nextInt(101);
        System.out.println("First number is : " + randomNumberOne);

        int randomNumberTwo = randomGenerator.nextInt(101);
        System.out.println("Second number is : " + randomNumberTwo);

        int randomNumberThree = randomGenerator.nextInt(101);
        System.out.println("Third number is : " + randomNumberThree);

        int sum = randomNumberOne + randomNumberTwo + randomNumberThree;
        System.out.println();
        System.out.println( randomNumberOne + " + "
                            + randomNumberTwo + " + "
                            + randomNumberThree + " = "
                            + sum);

    }

}
