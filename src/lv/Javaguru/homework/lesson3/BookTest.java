package lv.Javaguru.homework.lesson3;

public class BookTest {
    public static void main(String[] args) {

        Book firstBook = new Book();

        firstBook.setAuthor("Jānis");
        firstBook.setTitle("Padomi");
        firstBook.setPageCount(2123);
        firstBook.setYear(2019);

        printToConsole(firstBook);
    }

        public static void printToConsole(Book firstBook){
        System.out.println("The author is " + firstBook.getAuthor());
        System.out.println("The title is " + firstBook.getTitle());
        System.out.println("Total page count is " + firstBook.getPageCount());
        System.out.println("The year of the book is " + firstBook.getYear());
    }


}
