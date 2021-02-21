public class Loader {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.print();

        Cat cat2 = new Cat();
        cat2.print();

        Cat cat3 = new Cat();
        cat3.print();

        Cat cat4 = new Cat();
        cat4.print();

        Cat cat5 = new Cat();
        cat5.print();

        System.out.println("Cat feed");
        cat1.feed(0.5);
        cat1.print();

        System.out.println("Cat feed");
        cat2.feed(1.0);
        cat2.print();

        System.out.println(cat3.getStatus());
        while (cat3.getStatus() != "Exploded") {
            cat3.feed(1000.0);
        }
        System.out.println(cat3.getStatus());
        cat3.print();

        System.out.println(cat4.getStatus());
        while (cat4.getStatus() != "Dead") {
            cat4.meow();
        }
        System.out.println(cat4.getStatus());
        cat4.print();
    }
}