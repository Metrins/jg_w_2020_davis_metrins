package lv.Javaguru.homework.lesson2;

public class MathOperations {
    public static void main(String[] args) {

        double firstNumber = 11;
        double secondNumber = 5;

        double addition = firstNumber + secondNumber;
        double subtraction = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;
        double division = firstNumber / secondNumber;


        System.out.println("First number is " + firstNumber);
        System.out.println("Second number is " + secondNumber);

        System.out.println();

        System.out.println("Addition : " + firstNumber + " + " + secondNumber + " = " + addition);
        System.out.println("Subtraction : " + firstNumber + " - " + secondNumber + " = " + subtraction);
        System.out.println("Multiplication : " + firstNumber + " * " + secondNumber + " = " + multiplication);
        System.out.println("Division : " + firstNumber + " / " + secondNumber + " = " + division );

        // kā panākt, lai dalāmais un rezultāts parādās ar komatiem, ja ir decimālskaitlis,
        // bet bez komata, ja nav decimālskaitlis?

        //var izmantot casting, bet jāņem vērā ka tad zaudēsi info par to kas ir aiz komata
        //šādi daŗīt ir bīsatami un nepareizi, bet pagaidām mēs vēl citādi nemākam.
        //Tā kā pagaidām tas der
        System.out.println((int)addition);
    }
}
