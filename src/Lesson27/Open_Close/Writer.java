package Lesson27.Open_Close;

public class Writer {
    private String text;

    public Writer(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Writer{" +
                "text='" + text + '\'' +
                '}';
    }
}
