public class Song {
    private String tittle;
    private String author;
    private String text;

    public Song(String tittle, String author, String text) {
        this.tittle = tittle;
        this.author = author;
        this.text = text;
    }

    public Song() {
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Song { " +
                "tittle: " + tittle + '\'' +
                ", author: " + author + '\'' +
                ", text: " + text + '\'' +
                '}';
    }
}
