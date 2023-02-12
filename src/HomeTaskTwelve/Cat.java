package HomeTaskTwelve;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("The cat " + getName() + " is move.");
    }

    @Override
    public void moveSpeed() {
        System.out.println("His speed is 2 - 5 km/h.");
    }

    @Override
    public void run() {
        System.out.println("The " + getName() + " is run.");
    }

    @Override
    public void runSpeed() {
        System.out.println("His speed is 6 - 15 km/h.");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
