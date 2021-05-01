package lecture9.country;

public class Country {
    private String name;
    private int inhabitants;

    public Country(){
        this.name = "";
        this.inhabitants = 0;
    }
    public Country(String name, int inhabitants) {
        this.name = name;
        this.inhabitants = inhabitants;
    }
    public void print(){
        System.out.println(name + " has " + inhabitants + " inhabitants");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }
}
