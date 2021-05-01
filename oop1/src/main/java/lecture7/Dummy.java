package lecture7;

public class Dummy {
    private int value;

    /**
     * Parametrized Constructor
     * @param value The value
     */
    public Dummy(int value){
        this.value = value;
    }

    public Dummy(Dummy d){
        this.value = d.value;
    }

    public int getValue(){
        return value;
    }
    /**
     * checks two Dummy objects for equality
     * @param d the other dummy object
     * @return true if both objects are equals
     */
    public boolean equals(Dummy d){
        if(d!=null){
            if(d.getValue()!=this.getValue()){
                return false;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }
}
