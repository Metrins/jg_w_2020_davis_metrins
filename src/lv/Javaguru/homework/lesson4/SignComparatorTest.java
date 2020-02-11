package lv.Javaguru.homework.lesson4;

public class SignComparatorTest {
    SignComparator signComparator = new SignComparator();

    public static int findNumber() {
        int number = 123;
        return number;
    }

    public static void main(String[] args) {
        System.out.print(findNumber() + ": ");
        SignComparator.compare();

        }
}
