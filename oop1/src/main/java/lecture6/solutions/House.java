package lecture6.solutions;

public class House {
    int floors;
    boolean hasBalcony;
    int rooms;

    void addBalcony(){
        hasBalcony = true;
    }

    void print(){
        System.out.println("This house has " + floors + " floors and " + rooms + " rooms");
        if (hasBalcony) {
            System.out.println("Oh and it also has a balcony!");
        }
    }


}
