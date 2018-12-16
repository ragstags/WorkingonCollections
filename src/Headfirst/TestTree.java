package Headfirst;

import java.util.TreeSet;

/**
 * Created by nadimchouglay on 27/09/2017.
 */
public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();

    }
    public void go(){
        Book b1 =new Book("how cats work");
        Book b2 =new Book("Remix your body");
        Book b3 =new Book("Findinf Emo");;

        TreeSet<Book>tree =new TreeSet<>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);

    }
}
class Book implements Comparable{
    String title;
    public Book(String t){
        title=t;
    }

    @Override
    public int compareTo(Object b) {
        Book book =(Book)b;

        return (title.compareTo(book.title));
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}