package HomeTaskTen;

public class Ship extends Vehicle{

    private double passengersNumber;
    private String homePort;

    public Ship(int price, int speed, int yearProduction, double passengersNumber, String homePort) {
        super(price, speed, yearProduction);
        this.passengersNumber = passengersNumber;
        this.homePort = homePort;
    }

    public double getPassengersNumber() {
        return passengersNumber;
    }


    public String getHomePort() {
        return homePort;
    }


    @Override
    public void info() {
        super.info();
        System.out.println(" Number of passengers -> " + getPassengersNumber() + ", Home port -> " + getHomePort());
    }
}
