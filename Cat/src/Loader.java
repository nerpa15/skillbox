public class Loader {
    public static void main(String[] args) {
        Cat cat1 = new Cat(Color.RED);
        cat1.print();

        Cat cat2 = new Cat(Color.BLACK);
        cat2.print();

        Cat cat3 = new Cat(Color.WHITE);
        cat3.print();

        Cat cat4 = new Cat(Color.RED);
        cat4.print();

        Cat cat5 = new Cat(Color.BLACK);
        cat5.print();

        System.out.println(cat3.getStatus());
        while (cat3.getIsLive()){
            cat3.feed(1000.0);
        }
        System.out.println(cat3.getStatus());
        cat3.print();
        cat3.feed(1.0);
        cat3.meow();
        }
    }