package HomeTaskFourteen;

public class Main {
    public static void main(String[] args) {
        Animals pets = Animals.DOG;
        System.out.println(pets.toString());
        Animals forestAnimal = Animals.FOX;
        System.out.println(forestAnimal.toString());
        Animals seaAnimal = Animals.SHARK;
        System.out.println(seaAnimal.toString());
        Animals africanAnimals = Animals.MANKY;
        System.out.println(africanAnimals.toString());

        System.out.println("-".repeat(10));

        Vehicles carOpel = Vehicles.OPEL;
        System.out.println(carOpel.toString());
        Vehicles carMazda = Vehicles.MAZDA;
        System.out.println(carMazda.toString());
        Vehicles carPeugeot = Vehicles.PEUGEOT;
        System.out.println(carPeugeot.toString());


    }
}
