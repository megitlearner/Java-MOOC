
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> book;

    public Library() {
        book = new ArrayList<Book>();

    }

    public void addBook(Book newBook) {
        book.add(newBook);
    }

    public void printBooks() {
        for (Book b : book) {
            System.out.println(b);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (int i = 0; i < this.book.size(); i++) {
            if(StringUtils.included(this.book.get(i).title(), title)) {
                //if (this.book.get(i).title().contains(title)) {
                found.add(this.book.get(i));
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (int i = 0; i < this.book.size(); i++) {
            if (this.book.get(i).publisher.equals(publisher)) {
                found.add(this.book.get(i));
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found =  new ArrayList<Book>();
        for(int i = 0; i<this.book.size();i++) {
            if(this.book.get(i).year == year) {
                found.add(this.book.get(i));
            }
        }
        return found;
    }
}
