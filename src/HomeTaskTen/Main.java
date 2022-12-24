package HomeTaskTen;

public class Main {
    public static void main(String[] args) {

        Plane plane = new Plane(100000,700,2020,2000,12);
        plane.info();

        Car nisan = new Car(25000,260,2022,"Arya");
        nisan.info();

        Ship ship = new Ship(70000, 60,2021,35,"Odesa");
        ship.info();
        System.out.println();

        Printer printer = new Printer();
        printer.textYellow("Test Yellow");
        Printer printer1 = printer;
        printer1.textBlue("Test Blue");

    }
}
