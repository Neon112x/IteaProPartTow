package HomeTaskTen;

public class Vehicle {
    private int price;
    private int speed;
    private int yearProduction;

    public Vehicle(int price, int speed, int yearProduction) {
        this.price = price;
        this.speed = speed;
        this.yearProduction = yearProduction;
    }

    public int getPrice() {
        return price;
    }


    public int getSpeed() {
        return speed;
    }


    public int getYearProduction() {
        return yearProduction;
    }

    public void info() {
        System.out.print(getClass().descriptorString() + "\nPrice -> " + getPrice() + ", Speed -> " + getSpeed()
        + ", Production Year -> " + getYearProduction() + ",");
    }
}
