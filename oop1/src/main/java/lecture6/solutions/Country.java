package lecture6.solutions;

public class Country {
    String name;
    long inhabitants;

    static String humanRights;

    // Note: There is no main method in here!

    void immigrate(int x) {
        inhabitants = inhabitants + x;
    }
    void emigrate(int x){
        inhabitants = inhabitants - x;
    }
    void print(){
        System.out.println(name + " has " + inhabitants + " inhabitants.");
    }
    static void setHumanRights(String r){
        humanRights = r; //Note: The humanRights variable needs to be static!
    }

}
