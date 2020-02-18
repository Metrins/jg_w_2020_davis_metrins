package lv.Javaguru.homework.lesson3;
import java.util.Random;
public class CircleTest { //izmanto "ctrl + alt + l"

    public static void main(String[] args) {
        Circle myCircle = new Circle();

        //šeit ievade ar random nav obligata, pietiktu ar vienkārši kodā definējot mainīgi ar jebkādu vērtību
        Random randomRadius = new Random();
        int radius = randomRadius.nextInt(101);

        System.out.println("Random generated radius is : " + radius);

        myCircle.setRadius(radius);

        double result = myCircle.calculateField();

        System.out.println();
        System.out.println("Calculated circle area is : " + result);
        }

    }
