package lv.Javaguru.homework.lesson4;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class SignComparator {

    public static void printToConsole() {

        int newNumber = SignComparatorTest.findNumber();
        int mainNumber = 0;

        if (newNumber < mainNumber) {
            System.out.println("Number is negative");
        }
        if (newNumber == mainNumber) {
            System.out.println("Number is equal to zero.");
        }
        if (newNumber > mainNumber) {
            System.out.println("Number is positive");
        }
    }
}