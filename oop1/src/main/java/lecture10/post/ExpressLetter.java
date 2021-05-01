package lecture10.post;

public class ExpressLetter extends Letter implements Express {
    private String receiver;

    public ExpressLetter(String receiver, double weight){
        super(weight,true);
        this.receiver = receiver;
    }

    @Override
    public String getReceiver() {
        return receiver;
    }
    @Override
    public double getPrize(){
        return super.getPrize()*1.2;
    }
}
