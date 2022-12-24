package HomeTaskNine;

public class Computer {
    public static void main(String[] args) {
        String[] computers = new String[5];
        computers[0] = "Dell";
        computers[1] = "HP";
        computers[2] = "ASUS";
        computers[3] = "Lenovo";
        computers[4] = "SONY";

        for (int i = 0; i < 5; i++) {
            System.out.println("Computer: " + computers[i]);
        }
    }
}
