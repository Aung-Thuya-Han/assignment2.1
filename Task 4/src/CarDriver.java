public class CarDriver {

    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setTargetSpeed(80);
        boolean targetReached = myCar.turnOn();

        if (targetReached == true) {
            System.out.println("Cruise control is on");
            System.out.println("Target speed: " + myCar.getTargetSpeed() + " km/h");
            System.out.println("Current speed: " + myCar.getSpeed() + " km/h");
        } else {
            System.out.println("The target speed could not be reached");
            System.out.println("Cruise control is off");
        }

        myCar.turnOff();

        myCar.setTargetSpeed(40);
        targetReached = myCar.turnOn();

        if (targetReached == true) {
            System.out.println("The car decelerated to " + myCar.getSpeed() + " km/h");
        }

        myCar.turnOff();

        myCar.setTargetSpeed(45);
        targetReached = myCar.turnOn();

        if (targetReached == false) {
            System.out.println("The target speed could not be reached");
            System.out.println("Cruise control is off");
        }
    }
}

