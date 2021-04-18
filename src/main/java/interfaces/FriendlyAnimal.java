package interfaces;

public interface FriendlyAnimal{

   //int number=10; // public static final domyślnie

    void eat();
    void makeSound();



}

//można implementować wiele interfejsów
//interfejsy są domyślnie abstrakcyjne - mają abstrakcyjne metody i nie trzeba tego pisać
//służą do nadawania nowych kontekstów = nowych typów obiektów i decydowania o tym które metody można na nich wywołać
//można zrobić metodę z implementacją tylko dopisując 'default'
//nie mają konstruktorów ani pól
//pola zadeklarowane w interfejsie są automatycznie stałymi statycznymi
//interfejsy mogą implementować inne interejsy (dostają w spadku metody abstrakcyjne) ale piszemy EXTENDS

//KONKRETNE  ------------------------  ABSTRAKCYJNE
//klasa          abstrakcyjne klasy    interfejsy
