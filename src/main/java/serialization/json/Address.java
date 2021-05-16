package serialization.json;

class Address {
    private String street;
    private int nr;

    //obowiązkowo bezparametrowy konstruktor
    public Address(){
        System.out.println("Jackson wykorzystuje ten konstruktor");
    }

   public Address(String street, int nr) {
        this.street = street;
        this.nr = nr;
    }

    //obowiązkowo gettery
   public String getStreet() {
        return street;
    }

   public int getNr() {
        return nr;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", nr=" + nr +
                '}';
    }
}
