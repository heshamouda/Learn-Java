package lecture9.solutions.realestate;

public class Company {
    public static void main(String[] args) {
        Residence r1 = new Residence("Pascal", 1967, 500000, 1);
        Residence r2 = new Residence("Fredi", 1890, 1800000, 4);
        Residence r3 = new Residence("Michaela", 2005, 456000, 2);
        Residence r4 = new Residence("Paula", 1980, 3010000, 10);
        Residence r5 = new Residence("Christian", 1997, 130000, 3);

        OfficeBuilding o1 = new OfficeBuilding("Pack AG", 2009, 1690000, 100, 406);
        OfficeBuilding o2 = new OfficeBuilding("Oskar", 1987, 1050000, 0, 890);
        OfficeBuilding o3 = new OfficeBuilding("Päuli", 1920, 46000, 60, 60);
        OfficeBuilding o4 = new OfficeBuilding("Alta GmbH", 1969,2007000, 2000, 25);
        OfficeBuilding o5 = new OfficeBuilding("Oliver", 1993, 930000, 370, 95);

        Residence[] residences = new Residence[5];
        residences[0] = r1;
        residences[1] = r2;
        residences[2] = r3;
        residences[3] = r4;
        residences[4] = r5;
        OfficeBuilding[] officeBuildings = new OfficeBuilding[5];
        officeBuildings[0] = o1;
        officeBuildings[1] = o2;
        officeBuildings[2] = o3;
        officeBuildings[3] = o4;
        officeBuildings[4] = o5;

        Property[] properties = new Property[10];
        properties[0] = r1;
        properties[1] = r2;
        properties[2] = r3;
        properties[3] = r4;
        properties[4] = r5;
        properties[5] = o1;
        properties[6] = o2;
        properties[7] = o3;
        properties[8] = o4;
        properties[9] = o5;

        for(Property property : properties){
            property.print();
        }
    }
}
