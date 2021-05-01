package lecture4.solutions.programming;

public class Exercise5 {
    public static void main(String[] args) {
        int x = getInteger("1234");
        System.out.println(x);
    }

    public static int getInteger(String number){
        int result = 0;
        int factor = (int)Math.pow(10,number.length()-1); //Compute the initial factor (e.g. 1000 for a number of length 4)
        for(int i = 0; i<number.length();i++){
            char digit = number.charAt(i);
            if(digit>= '0' && digit <= '9'){
                int intDigit = ((int)(digit))-48; // Use the knowledge from the ASCII Table
                result += intDigit*factor;
                factor /= 10;
            }
        }
        return result;
    }
}
