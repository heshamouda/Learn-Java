package lecture7.solutions;

import java.util.Random;

public class BallFactory {
    public static void main(String[] args) {
        Ball[] balls = new Ball[20];

        // Create here 20 balls with a random radius
        Random random = new Random();
        for(int i = 0; i<balls.length;i++){
            balls[i] = new Ball(Math.random()*100);
        }

        double volume = 0;
        double surface = 0;
        for (int i = 0; i < balls.length; i++) {
            balls[i].printInfo();
            volume+=balls[i].getVolume();
            surface+=balls[i].getSurface();
        }

        /* Calculate here how large the total volume or surface is */
        System.out.println(volume +"  " + surface);

    }
}
