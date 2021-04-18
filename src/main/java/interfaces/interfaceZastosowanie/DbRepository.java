package interfaces.interfaceZastosowanie;

class DbRepository implements Repository {

    @Override
    public void save() {
        System.out.println("Zapis plików w bazie danych");
    }
    @Override
    public void load() {
        System.out.println("Wczytanie plików z bazy danych");
    }

}
