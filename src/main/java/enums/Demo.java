package enums;

class Demo {
    public static void main(String[] args) {
        int side = WorldDirection.EAST;

        WorldDirection2 side2 = WorldDirection2.WEST;
        System.out.println(side2.getDegree());
        System.out.println(side2.name()); // wyświetla nazwe
        System.out.println(side2.ordinal()); // wyświetla numer porządkowy

        RoadSign sign1 = new RoadSign(WorldDirection2.NORTH);
        RoadSign sign2 = new RoadSign(WorldDirection2.SOUTH);
        RoadSign sign3 = new RoadSign(WorldDirection2.NORTH);
        System.out.println(sign1.getDegree());
        System.out.println(sign2.getDegree());
        System.out.println(sign3.getDegree());

        System.out.println(sign1.getDirection()
                == (sign3.getDirection()));

        WorldDirection2[] values = WorldDirection2.values();
        for (WorldDirection2 value : values) {
            System.out.println(value);
        }

        switch (side2){
            case NORTH:
                System.out.println("Północ");
                break;
            case WEST:
                System.out.println("Zachód");
                break;
        }

        System.out.println(WorldDirection2.NORTH);



    }
}


