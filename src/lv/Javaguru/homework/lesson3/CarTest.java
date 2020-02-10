package lv.Javaguru.homework.lesson3;

import java.awt.*;
import java.util.Random;

public class CarTest {

    public static void main(String[] args) {

        Car myCar = new Car();


        myCar.setColor("Green");
        myCar.setManufacturer("MINI");
        myCar.setYear(2016);

        printConsule(myCar);

    }

        public static void printConsule (Car myCar){
            System.out.println("The color of the car is " + myCar.getColor());
            System.out.println("The manufacture of the car is " + myCar.getManufacturer());
            System.out.println("The year of the car is " + myCar.getYear());

        }
    }

/*  public static void generateColour(Car myCar){


        if (generatedColor == 0) { System.out.println("Grey" + generatedColor);}
        else if (generatedColor == 1) { System.out.println("Black" + generatedColor); }
        else if (generatedColor == 2) { System.out.println("White" + generatedColor); }
        else if (generatedColor == 3) { System.out.println("Red" + generatedColor); }
        else { System.out.println("Unknown Color" + generatedColor); }
        }
  */
