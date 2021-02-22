public class Loader {
    public static void main(String[] args) {
       Cat kitten1 = getKitten();
        kitten1.print();
        Cat kitten2 = getKitten();
        kitten2.print();
        Cat kitten3 = getKitten();
        kitten3.print();
    }

    private static Cat getKitten() {
        return new Cat(1100.00);
    }
}