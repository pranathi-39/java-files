public class books {
    private String title;
    private String author;
    private int yearOfPublication;
    public books(String title, String author, int yearOfPublication) {
    this.title = title;
    this.author = author;
    this.yearOfPublication = yearOfPublication;
    }
    public void bookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year of Publication: " + yearOfPublication);
    }
    public static void main(String[] args) {
        books book1 = new books("Linear Algebra", "Stanley", 1925);
        book1.bookDetails();
        books book2 = new books("OOPS", "RK", 2022);
        book2.bookDetails();
    }
}


