package HomeTaskTen;

public class Collar {
    private final String ANSI_YELLOW = "\u001B[33m";
    private final String ANSI_BLUE = "\u001B[44m";
    private final String ANSI_RESET = "\u001B[0m";

    public Collar() {
    }

    public String getANSI_YELLOW() {
        return ANSI_YELLOW;
    }

    public String getANSI_BLUE() {
        return ANSI_BLUE;
    }

    public String getANSI_RESET() {
        return ANSI_RESET;
    }
}
