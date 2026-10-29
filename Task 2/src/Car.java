public class Car {

    private double speed;
    private double gasolineLevel;
    private double gasolineTankCapacity;
    private String typeName;


    public Car(String typeName, double gasolineTankCapacity, double speed) {
        this.typeName = typeName;
        this.gasolineTankCapacity = gasolineTankCapacity;
        this.speed = speed;
        gasolineLevel = 0;
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed = speed + 10;
        } else {
            speed = 0;
        }
    }

    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0) {
                speed = Math.max(0, speed - amount);
            }
        } else {
            speed = 0;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public String getTypeName() {
        return typeName;
    }

    public void fillTank() {
        gasolineLevel = gasolineTankCapacity;
    }

    public double getGasolineLevel() {
        return gasolineLevel;
    }

    public double getGasolineTankCapacity() {
        return gasolineTankCapacity;
    }
}
