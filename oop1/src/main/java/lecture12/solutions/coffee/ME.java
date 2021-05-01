package lecture12.solutions.coffee;

public class ME {
    public static void main(String[] args) {
        CoffeeMachine myMachine = new CoffeeMachine();
        CoffeePad myPad = new CoffeePad(2, Variety.ESPRESSO);
        myMachine.fill(5);
        myMachine.brew(myPad);
    }
}
