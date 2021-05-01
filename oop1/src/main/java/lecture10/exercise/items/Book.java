package lecture10.exercise.items;

public class Book extends Item {
    private Author author;
    private String title;
    private String text;

    public Book(Author author, String title, String text, double prize){
        super(prize);
        this.author = author;
        this.title = title;
        this.text = text;
    }

    @Override
    public void getInfo() {
        System.out.println("The book " + title + " was written by " + author.getName());
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
