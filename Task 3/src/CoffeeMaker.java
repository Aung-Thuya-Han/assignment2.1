public class CoffeeMaker {

    private boolean on;
    private String coffeeType;
    private int coffeeAmount;

    public CoffeeMaker() {
        on = false;
        coffeeType = "normal";
        coffeeAmount = 10;
    }


    public void pressOnOff() {
        if (on == true) {
            on = false;
        } else {
            on = true;
        }
    }


    public void setCoffeeType(String coffeeType) {
        if (on == true) {
            if (coffeeType.equals("normal") || coffeeType.equals("espresso")) {
                this.coffeeType = coffeeType;
            }
        }
    }

    public String getCoffeeType() {
        return coffeeType;
    }


    public void setCoffeeAmount(int coffeeAmount) {
        if (on) {
            if (coffeeAmount >= 10 && coffeeAmount <= 80) {
                this.coffeeAmount = coffeeAmount;
            }
        }
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }
}
