public class Ansi {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[36m";

    private static final Ansi instance = new Ansi();

    private Ansi() {
    }


    public static Ansi getInstance() {
        return instance;
    }

    void printYellow(String message) {
        System.out.println(ANSI_YELLOW + message + ANSI_RESET);
    }

    void printGreen(String message) {
        System.out.println(ANSI_GREEN + message + ANSI_RESET);
    }

    void printBlue(String message) {
        System.out.println(ANSI_BLUE + message + ANSI_RESET);
    }


}
