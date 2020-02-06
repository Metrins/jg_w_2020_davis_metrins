package lv.Javaguru.homework.lesson3;

public class CircleTest {
    public static void main(String[] args) {
        Circle myCircle = new Circle();

        myCircle.setRadius(8);

        double result = myCircle.calculateField();
        System.out.println(result);
        }

    }
