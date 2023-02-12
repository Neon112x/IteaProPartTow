package HomeTaskTwelve;

public class Main {
    public static void main(String[] args) {
        Cat tom = new Cat("Tom");
        Cat garfield = new Cat("Garfield");
        Animal.hello(tom.getName());
        tom.move();
        tom.moveSpeed();
        tom.run();
        tom.runSpeed();
        Animal.hello(garfield.getName());
        garfield.move();
        garfield.moveSpeed();

        System.out.println("-".repeat(10));
        Dog dog = new Dog("Ozi");
        Dog.hello(dog.getName());
        dog.move();
        dog.moveSpeed();
        dog.run();
        dog.runSpeed();


        System.out.println("-".repeat(10));
        Temperature temp = new Temperature();
        Temperature.celsius = 22;
        temp.convertFahrenheit();
        temp.convertKelvins();
    }
}
