package HomeTaskNine;

public class Main {
    public static void main(String[] args) {
        Address alexHome = new Address("Lviv", "NewStreet", 12, 7);
        Address alexNewHome = new Address(27,5);

        System.out.println(alexHome.toString());
        System.out.println(alexNewHome.toString());

        alexNewHome.setIndex(4000);
        alexNewHome.setCity("Odesa");
        alexNewHome.setStreet("NewWay");
        System.out.println("Index = " + alexNewHome.getIndex() + ", country = " + alexNewHome.getCountry() +
                ", city = " + alexNewHome.getCity() + ", street = " + alexNewHome.getStreet()
        + ", house = " + alexNewHome.getHouse() + ", apartment = " + alexNewHome.getApartment());


    }
}
