package rozwiazania.zaawansowane.zad25;

class Document {

    private String content = "";
    private int fontSize = 12;
    private String color = "black";


    //Zaimplementuj metodę append(String) która pozwoli dodać do treści przekazany ciąg znaków
    public void append(String text) {
        content += text;
    }

    //backspace(), której zadaniem będzie usunięcie ostatniego znaku, który zawiera content.
    public void backspace() {
        if (content.isEmpty()) {
            return;
        }
        content = content.substring(0, content.length() - 1);   // ctrl + P
    }

    //    createMemento() która zwraca pamiątkę na bazie aktualnego stanu dokumentu
    public DocumentMemento createMemento() {
        return new DocumentMemento(content, fontSize, color);
    }

    //    rollback(DocumentMemento) przyjmująca pamiątkę i ustawiająca stan dokumentu na ten z pamiątki
    public void rollback(DocumentMemento memento) {
        content = memento.getContent();
        fontSize = memento.getFontSize();
        color= memento.getColor();
    }


    void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontSize=" + fontSize +
                ", color='" + color + '\'' +
                '}';
    }
}
