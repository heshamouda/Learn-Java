package lecture9.country;

public class Republic extends Country{
    private String[] government;

    public Republic(String name, int inhabitants, int governmentSize){
        super(name, inhabitants);
        this.government = new String[governmentSize];
    }

    @Override
    public void print() {
        System.out.println("The republic " + getName() + " has " + getInhabitants() + " inhabitants and its" +
                "government has " + government.length + " members.");
    }

    public String[] getGovernment() {
        return government;
    }

    public void setGovernment(String[] government) {
        this.government = government;
    }
}
