public class Console {
    public static final String LIGNE_HORIZONTALE = "---------------------------------------------------";
    public static void message(String txt) {
        System.out.println(txt);
    }

    public static void titre(String txt) {
        message(LIGNE_HORIZONTALE);
        message(txt);
        message(LIGNE_HORIZONTALE);
    }
}
