
public class Book {
	private String title;
	private Member mbr;
	
	public Book(String title) {
		this.title=title;
	}
	
    public void issueBook(Member m) {
        mbr = m;
    }

    public void returnBook() {
        mbr = null;
    }
	
	@Override
	public String toString() {
		return "Book [Title=" + title+"]";
	}
	
	public void status(){
		if(mbr == null)
			System.out.println(title + " has not issued any book");
		else
			System.out.println(title + " is issued to " + mbr);
	}
	
}
