package HomeTaskTen;

public class Printer extends Collar{

    public void textBlue (String value) {

        System.out.println(getANSI_BLUE() + value + getANSI_RESET());
    }

    public void textYellow (String value) {

        System.out.println(getANSI_YELLOW() + value + getANSI_RESET());
    }

}
