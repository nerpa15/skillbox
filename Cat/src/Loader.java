public class Loader {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat(cat1.getWeight(), cat1.getColor());
        cat1.print();
        cat2.print();
        cat2.setWeight(5.0);
        cat2.setLive(false);
        cat2.print();
        Cat cat3 = cat2.copyCat();
        cat3.print();
    }

    private static Cat getKitten() {
        return new Cat(1100.00);
    }
}