package lv.Javaguru.homework.lesson3;

import sun.rmi.rmic.Generator;

import java.util.Random;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator myCalculator = new Calculator();

        Random random = new Random();
        int firstNumber = random.nextInt(101);
        int secondNumber = random.nextInt(101);

        int sumResult = myCalculator.sum(firstNumber,secondNumber);
        int subtractResult = myCalculator.subtract(firstNumber,secondNumber);
        int multiplyResult = myCalculator.multiply(firstNumber,secondNumber);
        double divideResult = myCalculator.divide(firstNumber,secondNumber);

        System.out.println("First number is: " + firstNumber);
        System.out.println("Second number is: " + secondNumber);
        System.out.println();

        System.out.println("Sum result : " + sumResult);
        System.out.println("Subtract result : " + subtractResult);
        System.out.println("Multiply result : " + multiplyResult);
        System.out.println("Divide result : " + divideResult);

  /*  printInConsole(myCalculator);
    }

     public static void printInConsole(Calculator myCalculator) {
         System.out.println("Sum result : " );
         System.out.println("Subtract result : " );
         System.out.println("Multiply result : " );
         System.out.println("Divide result : " );

  */   }
    }

