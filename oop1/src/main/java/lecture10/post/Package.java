package lecture10.post;

public class Package extends Item {

    public Package(double weight){
        super(weight);
    }

    @Override
    public double getPrize() {
        return 5.50;
    }
}
