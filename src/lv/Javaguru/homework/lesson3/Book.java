package lv.Javaguru.homework.lesson3;

public class Book {

    //autors, izlaiduma gads, nosaukums un lapušu daudzums.
    String author;
    String title;
    int year;
    int pageCount;

    public String getAuthor() {return author;}
    public String getTitle() {return title;}
    public int getYear() {return year;}
    public int getPageCount() {return pageCount;}

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
