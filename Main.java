package Book;

public class Main {
    public static void main (String[]args){
        Book d1 = new Book ("Harry Potter",366);
        Book d2 = new Book("The Lord of the Rings",473);
        Book d3 = new Book ("Sherlock Holmes",329);
        d1.bookMark();
        d2.bookMark();
        d3.bookMark();

    }
}
