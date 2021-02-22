public class Cat {
    private static int countCat = 0;
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double weightFood;
    private boolean isLive;


    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        weightFood = 0;
        countCat = countCat + 1;
        isLive = true;
    }

    public void meow() {
        if (getIsLive()) {
            weight = weight - 1;
            System.out.println("Meow");
        } else {
            System.out.println("Кошка Deid");
        }
    }


    public void feed(Double amount) {
        if (getIsLive()) {
            weight = weight + amount;
            weightFood = weightFood + amount;
        } else {
            System.out.println("Кошка Deid");
        }
    }

    public void drink(Double amount) {
        if (getIsLive()) {
            weight = weight + amount;
            weightFood = weightFood + amount;
        } else {
            System.out.println("Кошка Deid");
        }
    }

    public Double getWeight() {
        return weight;
    }

    public Double getWeightFood() {
        return weightFood;
    }

    public static int getCountCat() {
        return countCat;
    }

    public void pee() {
        if (getIsLive()) {
            weight = weight - 0.1;
            System.out.println("Что-то очень личное");
        } else {
            System.out.println("Кошка Deid");
        }

    }

    public boolean getIsLive() {
        if (isLive && ((weight < minWeight) || (weight > maxWeight))) {
            isLive = false;
            countCat = countCat - 1;
        }
        return isLive;
    }

    public String getStatus() {
        if (getIsLive()) {
            if (weight > originWeight) {
                return "Sleeping";
            } else {
                return "Playing";
            }
        } else {
            return "Dead";
        }
    }

    public void print() {
        System.out.println("Cat{" +
                "originWeight=" + originWeight +
                ", weight=" + weight + '}');
        System.out.println("Всего кошек " + getCountCat());
    }

}