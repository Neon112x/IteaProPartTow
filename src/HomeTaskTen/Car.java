package HomeTaskTen;

public class Car extends Vehicle{
    private String model;

    public Car(int price, int speed, int yearProduction, String model) {
        super(price, speed, yearProduction);
        this.model = model;
    }

    public String getModel() {
        return model;
    }


    @Override
    public void info() {
        super.info();
        System.out.println(" Model -> " + getModel());
    }
}
