package lv.Javaguru.homework.lesson3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class HumanTest {

    public static void main(String[] args) {

        Human thatHuman = new Human();
        thatHuman.setHumanName("John");
        thatHuman.setHumanAge(20);

        String thatHumanName = thatHuman.getHumanName();
        int thatHumanAge = thatHuman.getHumanAge();

        humanSay(thatHuman);
        System.out.println("My name is " + thatHumanName + ", I am " + thatHumanAge + " years old!");
    }
        private static void humanSay (Human thatHuman) { thatHuman.sayHi(); }

    }

