package HomeTaskNine;

public class Content extends Author{
    private String content;

    public Content() {
        this.content = "Enter Content";
    }

    public Content(String author, String content) {
        super(author);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
