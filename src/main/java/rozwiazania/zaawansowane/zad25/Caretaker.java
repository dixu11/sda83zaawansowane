package rozwiazania.zaawansowane.zad25;

import java.util.Deque;
import java.util.LinkedList;

class Caretaker {

//    Zaimplementuj klasę Caretaker jako obiekt zarządzający pamiątkami. Ma być tworzony dla
//*  konkretnego dokumentu oraz przechowywać jego wcześniejsze stany za pomocą stosu.

    private Document document;
    private Deque<DocumentMemento> history = new LinkedList<>();


    Caretaker(Document document) {
        this.document = document;
    }

//    save() zapisująca bieżący stan dokumentu
//    restore() cofająca dokument do poprzedniego stani

    public void save() {
        history.addLast(document.createMemento());
    }

    public void restore() {
        if (history.isEmpty()) return; // dla jednej instrukcji działa bez klamry
        document.rollback(history.removeLast());
    }

    @Override
    public String toString() {
        return "Caretaker{" +
                "document=" + document +
                ", history=" + history +
                '}';
    }
}
