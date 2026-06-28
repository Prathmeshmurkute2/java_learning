public class TestLibrary {

    public static void main(String[] args) {

        Book b1 = new Book("The Alchemist");
        Book b2 = new Book("Kite Runner");

        Member m1 = new Member("George");
        Member m2 = new Member("Martha");

        System.out.println("Initial Status:");
        b1.status();
        m1.status();

        // Issue book to member
        b1.issueBook(m1);
        m1.issueBook(b1);

        System.out.println("\nAfter Issuing Book:");
        b1.status();
        m1.status();

        // Return book from member
        b1.returnBook();
        m1.returnBook();

        System.out.println("\nAfter Returning Book:");
        b1.status();
        m1.status();
    }
}