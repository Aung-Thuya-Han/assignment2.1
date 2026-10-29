public class CarDriver {

    public static void main(String[] args) {
        Car myCar = new Car("Toyota Corolla", 50, 20);

        myCar.fillTank();
        myCar.accelerate();

        System.out.println("Car: " + myCar.getTypeName());
        System.out.println("Tank capacity: " + myCar.getGasolineTankCapacity() + " liters");
        System.out.println("Speed: " + myCar.getSpeed() + " km/h");
    }
}
