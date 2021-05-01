package lecture1.solutions;

import java.util.Scanner;

public class AgeDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1, name2;
        int age1, age2;
        float height1, height2;
        float weight1, weight2;
        System.out.println("Enter the name of the first person");
        name1 = scanner.next();
        System.out.println("Enter the name of the second person");
        name2 = scanner.next();
        System.out.println("Enter the age of the first person");
        age1 = scanner.nextInt();
        System.out.println("Enter the age of the second person");
        age2 = scanner.nextInt();
        System.out.println("Enter the height (m) of the first person");
        height1 = scanner.nextFloat();
        System.out.println("Enter the height (m) of the second person");
        height2 = scanner.nextFloat();
        System.out.println("Enter the weight (kg) of the first person");
        weight1 = scanner.nextFloat();
        System.out.println("Enter the weight (kg) of the second person");
        weight2 = scanner.nextFloat();
        int diff = age1 - age2;
        float bmi1 = weight1 / (height1*height1);
        float bmi2 = weight2 / (height2*height2);
        System.out.println(name1 + " is " + age1 + " years old and has a BMI of " + bmi1);
        System.out.println(name2 + " is " + age2 + " years old and has a BMI of " + bmi2);

        System.out.println(name1 + " is " + diff + " years older than " + name2);

    }
}
