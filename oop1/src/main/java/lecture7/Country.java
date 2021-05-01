package lecture7;

public class Country {
    private String name;
    private long inhabitants;

    public Country(){
        this(0, "Country");
        //setInhabitants(0);
        //setName("Country");
    }

    public Country(int inhabitants, String name){
        setInhabitants(inhabitants);
        setName(name);
    }

    public Country(Country c){
        setInhabitants(c.getInhabitants());
        setName(c.getName());
    }



    void immigrate(int x) {
        inhabitants = inhabitants + x;
    }

    void emigrate(int x) {
        inhabitants = inhabitants - x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(long inhabitants) {
        if(inhabitants < 0){
            this.inhabitants = 0;
        }else {
            this.inhabitants = inhabitants;
        }
    }
}
