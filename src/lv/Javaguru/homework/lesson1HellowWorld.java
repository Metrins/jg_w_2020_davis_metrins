package lv.Javaguru.homework;


import java.sql.SQLOutput;

public class lesson1HellowWorld {
    public static void main(String[] args) {

        int firstNumber = 10;
        int secondNumber = 5;

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;

        System.out.println("First number is 10");
        System.out.println("Second number is 5");

        System.out.println();

        System.out.println("Addition : " + firstNumber + " + " + secondNumber + " = " + addition);
        System.out.println("Subtraction : " + firstNumber + " - " + secondNumber + " = " + subtraction);
        System.out.println("Multiplication : " + firstNumber + " * " + secondNumber + " = " + multiplication);
        System.out.println("Division : " + firstNumber + " / " + secondNumber + " = " + division);
    }
}
