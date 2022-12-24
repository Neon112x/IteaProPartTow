package HomeTaskNine;

public class Title  extends Content{
    private String title;

    public Title() {
        this.title = "Enter Title";
    }

    public Title(String author, String content, String title) {
        super(author, content);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void show() {
        System.out.printf("Title: %s %nAuthor: %s %nContent: %s %n", getTitle(), getAuthor(), getContent());
    }
}
