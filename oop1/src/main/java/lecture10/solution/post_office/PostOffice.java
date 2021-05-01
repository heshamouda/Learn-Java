package lecture10.solution.post_office;

public class PostOffice {
    private Item[] items;
    private int nextFreePos;

    public PostOffice(int size) {
        this.items = new Item[size];
    }

    public boolean addItem(Item item) {
        if (item != null && nextFreePos < items.length) {
            items[nextFreePos++] = item;
            return true;
        } else {
            return false;
        }
    }

    public boolean addItem(Letter letter) {
        if (addItem((Item)letter)) {
            System.out.println("Thank you for your letter");
            return true;
        } else {
            return false;
        }
    }

    public boolean addItem(Parcel parcel) {
        if (addItem((Item)parcel)) {
            System.out.println("Thank you for your parcel");
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        for (int i = 0; i < items.length; i++) {
            items[i] = null;
        }
        nextFreePos = 0;
    }

    public void sendItems() {
        for (int i = 0; i < nextFreePos; i++) {
            items[i].getReceiver().receiveItem(items[i]);
        }
        clear();
    }


}
