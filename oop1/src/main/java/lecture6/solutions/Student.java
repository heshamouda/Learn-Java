package lecture6.solutions;

public class Student {
    String name;
    String studentId;
    float[] grades = new float[10];

    void addGrade(int index, float grade){
        if(index > grades.length || index < 0){
            System.out.println("Please provide an index that is within bounds");
        }
    }

}
