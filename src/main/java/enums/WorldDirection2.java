package enums;

enum WorldDirection2 {
    //wartości
    NORTH(0),
    EAST(90),
    SOUTH(180),
    WEST(270);

    //cechy
    private int degree;

    //konstruktory
   private WorldDirection2(int degree) {
        this.degree = degree;
    }

    //zachowania
    int getDegree() {
        return degree;
    }

   /* @Override
    public String toString() {
        return "WorldDirection2{" +
                "degree=" + degree +
                '}';
    }*/
}
