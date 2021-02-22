public class Cat {
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double weightFood;


    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        weightFood = 0;

    }

    public void meow() {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount) {
        weight = weight + amount;
        weightFood = weightFood + amount;
    }

    public void drink(Double amount) {
        weight = weight + amount;
        weightFood = weightFood + amount;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getWeightFood() {
        return weightFood;
    }

    public void pee() {
        weight = weight - 0.1;
        System.out.println("Что-то очень личное");

    }

    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    public void print() {
        System.out.println("Cat{" +
                "originWeight=" + originWeight +
                ", weight=" + weight +
                '}');

    }

}