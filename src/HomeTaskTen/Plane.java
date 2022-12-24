package HomeTaskTen;

public class Plane extends Vehicle {
private int height;
private int passengersNumber;

    public Plane(int price, int speed, int yearProduction, int height, int passengersNumber) {
        super(price, speed, yearProduction);
        this.height = height;
        this.passengersNumber = passengersNumber;
    }

    public int getHeight() {
        return height;
    }


    public double getPassengersNumber() {
        return passengersNumber;
    }

    @Override
    public void info() {
        super.info();
        System.out.println(" Height -> " + getHeight() + ", Number of passengers -> " + getPassengersNumber() + ".");
    }
}
