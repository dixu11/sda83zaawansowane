package interfaces.interfaceZastosowanie;

class FileRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Zapisuję pliki na dysku");
    }

    @Override
    public void load() {
        System.out.println("Odczytuję pliki z dysku");
    }
}
