public class Car {

    private double speed;
    private double targetSpeed;
    private boolean cruiseControlOn;
    private double minimumCruiseSpeed = 30;
    private double maximumCruiseSpeed = 120;

    public void accelerate() {
        speed = speed + 10;
    }

    public void decelerate() {
        speed = speed - 10;

        if (speed < 0) {
            speed = 0;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public void setTargetSpeed(double targetSpeed) {
        this.targetSpeed = targetSpeed;
    }

    public double getTargetSpeed() {
        return targetSpeed;
    }

    public boolean turnOn() {
        if (targetSpeed < minimumCruiseSpeed || targetSpeed > maximumCruiseSpeed) {
            cruiseControlOn = false;
            return false;
        }

        cruiseControlOn = true;

        if (speed < targetSpeed) {
            while (speed < targetSpeed) {
                accelerate();
            }
        } else if (speed > targetSpeed) {
            while (speed > targetSpeed) {
                decelerate();
            }
        }

        if (speed != targetSpeed) {
            cruiseControlOn = false;
            return false;
        }

        return true;
    }

    public void turnOff() {
        cruiseControlOn = false;
    }
}
