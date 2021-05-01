package lecture10.post;

public class Bag {
    private Item[] content;

    public Bag() {
        content = new Item[7];
    }

    public void addItem(Item item) {
        boolean set = false;
        int i = 0;
        while (i < content.length && !set) {
            if (content[i] == null) {
                content[i] = item;
                set = true;
            }
            i++;
        }
    }

    public double getPrize(){
        double prize = 0.0;
        for(Item item : content){
            if(item != null){
                prize += item.getPrize();
            }
        }
        return prize;
    }

    public int getAmountOfLetters(){
        int counter = 0;
        for(Item item : content){
            if(item instanceof Letter) {
                counter++;
            }
        }
        return counter;
    }
}
