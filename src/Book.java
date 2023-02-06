public class Book {

    private String bookName;

    private int publishingYear;

    private Author author;


    public Book(String bookName, int publishingYear, Author author) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public Author getAuthor() {
        return author;

    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void printInfoAboutBook(){
        System.out.println("Автор: " + getAuthor().getName()+ " " + getAuthor().getSurname() + " " + "Название: " + getBookName()+ " " + "Год публикации: " + getPublishingYear());
    }




}
