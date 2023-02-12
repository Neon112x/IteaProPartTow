package HomeTaskTwelve;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public static void hello () {
        System.out.println("Hello!! I am animal");
    }

    @Override
    public void move() {
        System.out.println("The dog " + getName() + " is move.");
    }

    @Override
    public void moveSpeed() {
        System.out.println("His speed is 2 - 7 km/h.");
    }

    @Override
    public void run() {
        System.out.println("The dog " + getName() + " is run.");
    }

    @Override
    public void runSpeed() {
        System.out.println("His speed is 8 - 30 km/h.");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
