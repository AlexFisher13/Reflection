/**
 * Created by Fisher on 30.05.2016.
 */
public class Car {
    private String name = "Cruze";
    private int weight = 1470;
    private double maxSpeed = 150d;

    public Car() {}

    private Car(String name, int weight, double maxSpeed) {
        this.name = name;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    private Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    private String getName() {
        return name;
    }

    private int getWeight() {
        return weight;
    }

    private double getMaxSpeed() {
        return maxSpeed;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setWeight(int weight) {
        this.weight = weight;
    }

    private void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

