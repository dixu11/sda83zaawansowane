package rozwiazania.zaawansowane.zad25;

class DocumentMemento {
    private final String content;
    private final int fontSize;
    private final String color;

    DocumentMemento(String content, int fontSize, String color) {
        this.content = content;
        this.fontSize = fontSize;
        this.color = color;
      //  this.color = "sdfs"; nie można przestawić zmiennej final
    }

    String getContent() {
        return content;
    }

    int getFontSize() {
        return fontSize;
    }

    String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "DocumentMemento{" +
                "content='" + content + '\'' +
                ", fontSize=" + fontSize +
                ", color='" + color + '\'' +
                '}';
    }
}
