package java8;

class ShopDemo {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.add(new Product("chleb",3));
        shop.add(new Product("mleko",2.5));
        shop.add(new Product("jajka", 6));

        System.out.println(shop.findAllProductsBelow(5));
        System.out.println(shop.findAllProductsBelowStream(5));
    }
}
