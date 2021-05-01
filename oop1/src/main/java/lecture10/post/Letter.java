package lecture10.post;

public class Letter extends Item{
    private boolean type; //Indicating A/B-Post

    public Letter(double weight, boolean type){
        super(weight);
        this.type = type;
    }

    @Override
    public double getPrize() {
        if(type){
            if(getWeight() <= 100){
                return 1.0;
            }else{
                return 1.1;
            }
        }else{
            return 0.8;
        }
    }
}
