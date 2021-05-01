package lecture10.post;

public class ExpressPackage extends Package implements Express {
    private String receiver;

    public ExpressPackage(String receiver, double weight) {
        super(weight);
        this.receiver = receiver;
    }

    @Override
    public double getPrize() {
        return super.getPrize() * 2;
    }

    @Override
    public String getReceiver() {
        return receiver;
    }
}
