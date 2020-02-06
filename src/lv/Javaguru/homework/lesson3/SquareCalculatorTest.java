package lv.Javaguru.homework.lesson3;

public class SquareCalculatorTest {
    public static void main(String[] args) {
        SquareCalculator myCalculator = new SquareCalculator();

        int expectedResult = 225;
        int actualResult = myCalculator.calculateSquare(15);

        System.out.println("Expected Result : " + expectedResult);
        System.out.println("Actual Result : " + actualResult);
        System.out.print("Expected result is : ");
        System.out.println(expectedResult==actualResult);
    }
}
