package lecture9.solutions.realestate;

public class OfficeBuilding extends Property{
    private double storageArea;
    private double officeArea;

    public OfficeBuilding(String owner, int constructionYear, double price, double storageArea, double officeArea){
        super(owner, constructionYear, price);
        this.storageArea = storageArea;
        this.officeArea = officeArea;
    }

    @Override
    public void print() {
        System.out.println("The office building of " + getOwner() + " from year " + getConstructionYear() +
                " is valued at " + getPrice());
        System.out.println("It has " + storageArea + " storage area and " + officeArea + " office area");

    }

    public double getStorageArea() {
        return storageArea;
    }

    public void setStorageArea(double storageArea) {
        this.storageArea = storageArea;
    }

    public double getOfficeArea() {
        return officeArea;
    }

    public void setOfficeArea(double officeArea) {
        this.officeArea = officeArea;
    }
}
