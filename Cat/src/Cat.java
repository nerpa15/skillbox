public class Cat {
    private static int countCat = 0;
    private static final double MIN_WEIGHT = 1000.0;
    private static final double MAX_WEIGHT = 9000.0;
    private static final int COUNT_EYE = 4;
    private double originWeight;
    private double weight;
    private double weightFood;
    private boolean isLive;
    private Color color;


    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        weightFood = 0;
        countCat = countCat + 1;
        isLive = true;
        color = Color.BLACK;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Cat(Double weight) {
        this.weight = weight;
        originWeight = weight;
        weightFood = 0;
        countCat = countCat + 1;
        isLive = true;
        color = Color.WHITE;
    }

    public void meow() {
        if (isAlive()) {
            weight = weight - 1;
            System.out.println("Meow");
        } else {
            System.out.println("Кошка Deid");
        }
    }


    public void feed(Double amount) {
        if (isAlive()) {
            weight = weight + amount;
            weightFood = weightFood + amount;
        } else {
            System.out.println("Кошка Deid");
        }
    }

    public void drink(Double amount) {
        if (isAlive()) {
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
        if (isAlive()) {
            weight = weight - 0.1;
            System.out.println("Что-то очень личное");
        } else {
            System.out.println("Кошка Deid");
        }

    }

    public boolean isAlive() {
        if (isLive && ((weight < MIN_WEIGHT) || (weight > MAX_WEIGHT))) {
            isLive = false;
            countCat = countCat - 1;
        }
        return isLive;
    }

    public String getStatus() {
        if (isAlive()) {
            if (weight > originWeight) {
                return "Sleeping";
            } else {
                return "Playing";
            }
        } else {
            return "Dead";
        }
    }

    public Cat(double weight, Color color) {
        this.weight = weight;
        this.color = color;
        originWeight = weight;
        weightFood = 0;
        countCat = countCat + 1;
        isLive = true;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setLive(boolean live) {
        if ((isLive)&&(!live)) {
            countCat = countCat - 1;
        }
        isLive = live;
    }

    public Cat copyCat() {
        Cat cat = new Cat();
        cat.setWeight(this.weight);
        cat.setColor(this.color);
        cat.originWeight = cat.getWeight();
        cat.weightFood = 0;
        cat.setLive(this.isAlive());
        return cat;
    }

    public void print() {
        System.out.println("Cat{" +
                "Кошка жива? " + isAlive() +
                " originWeight=" + originWeight +
                ", weight=" + weight +
                ", color=" + color.toString() +
                '}');
        System.out.println("Всего живых кошек " + getCountCat());
    }

}