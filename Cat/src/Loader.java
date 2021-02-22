public class Loader {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.print();
        cat1.feed(150.00 );
        cat1.feed(100.00 );
        cat1.pee();
        cat1.pee();
        System.out.println("Кошка съела "+cat1.getWeightFood());
    }
}