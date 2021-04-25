package rozwiazania.zaawansowane.zad25;

class MementoDemo {

    /*
    * Zaimplementuj wzorzec memento.
Przygotuj klasę Document z polami content, fontSize oraz color.
* Zaimplementuj metodę append(String) która pozwoli dodać do treści
* przekazany ciąg znaków oraz backspace(), której zadaniem będzie usunięcie ostatniego znaku,
*  który zawiera content. Dodatkowo wygeneruj settery do pozostałych pól oraz przygotuj metodę
*  toString().
Stwórz klasę DocumentMemento z takimi samymi polami jak oryginalny dokument jednak jej
*  obiekty mają być typu Immutable
W klasie Document przygotuj metody:
 createMemento() która zwraca pamiątkę na bazie aktualnego stanu dokumentu
rollback(DocumentMemento) przyjmująca pamiątkę i ustawiająca stan dokumentu na ten z pamiątki
Zaimplementuj klasę Caretaker jako obiekt zarządzający pamiątkami. Ma być tworzony dla
*  konkretnego dokumentu oraz przechowywać jego wcześniejsze stany za pomocą stosu.
*  Ma udostępniać dwie metody:
save() zapisująca bieżący stan dokumentu
reverse() cofająca dokument do poprzedniego stani
przetestuj aplikację kilkukrotnie wywołując metody save() i reverse().
* Zadbaj o to aby aplikacja nie zatrzymywała się jeśli wowołamy reverse()
* więcej razy niż dokument został zapisany
    *
    * */


    public static void main(String[] args) {
        Document document = new Document();
        document.append("Hello");
        document.append(" World");
        document.backspace();
        System.out.println("Stan dokumentu: " + document);
        DocumentMemento memento = document.createMemento();
        System.out.println("powstała pamiątka: " + memento);
        document.setFontSize(20);
        System.out.println("Dokument po zmianie: " + document);
        document.rollback(memento);
        System.out.println("Przywrócony stan dokumentu: " + document);

        System.out.println("--------------");
        Caretaker caretaker = new Caretaker(document); // zajmij się archiwizacją tego dokumentu
        caretaker.save();
        System.out.println("Zapisany dokument: ");
        System.out.println(document);
        document.setColor("RED");
        System.out.println("Po modyfikacji:");
        System.out.println(document);
        caretaker.save();
        document.setFontSize(6);
        System.out.println("Po kolejnej modyfikacji:");
        System.out.println(document);
        caretaker.restore();
        System.out.println("Po odtworzeniu:");
        System.out.println(document);
        caretaker.restore();
        System.out.println("Jeszcze jeden restore");
        System.out.println(document);
    }
}
