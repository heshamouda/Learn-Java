package lecture12.solutions.coffee;

public class CoffeeMachine {
    private int fillAmount;

    public CoffeeMachine(){
        fillAmount = 0;
    }

    public int getFillAmount(){
        return fillAmount;
    }
    public void fill(int amount){
        fillAmount = fillAmount+amount;
    }

    public void brew(CoffeePad pad){
        if(fillAmount >= pad.getDl()){
            System.out.println("Please have a " + pad.getType());
            fillAmount -= pad.getDl();
        }else{
            System.out.println("The water tank is empty, please fill!");
        }
    }
}
