package interfaces.interfaceZastosowanie;

class Application {

    private Repository repository;

    Application(Repository repository) {
        this.repository = repository;
    }

    public void start() {
        System.out.println("Uruchamiamy aplikację");
        repository.load();
    }

    public void close() {
        System.out.println("Zamykamy aplikację");
        repository.save();
    }


}

//dzięki takiej architekturze klasa Application nie wymaga
//żadnej zmiany przy decyzji przestawienia się na inne repozytorium
// dostanie po prostu inną implementację (inny obiekt) implementujący
// odpowiedni interfejs
