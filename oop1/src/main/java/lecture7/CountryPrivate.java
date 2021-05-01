package lecture7;

public class CountryPrivate {
    private String name;
    private long inhabitants;

    void immigrate(int x) {
        inhabitants = inhabitants + x;
    }

    void emigrate(int x) {
        inhabitants = inhabitants - x;
    }
}
