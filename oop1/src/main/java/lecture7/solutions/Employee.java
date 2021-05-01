package lecture7.solutions;

public class Employee {
    private double salary;
    private int position;
    private static int counter;

    public Employee(int pos){
        counter++;
        this.position=pos;
        if (position==1){
            salary = 150000 +90000*Math.random();
        } else if (position== 2){
            salary = 90000 +60000*Math.random();
        } else {
            salary = 60000 +30000*Math.random();
        }
    }

    public Employee(Employee m){
        salary = m.salary;
        position= m.position;
    }

    public void print(){
        System.out.println("Area "+getSpace()+ " - Salary "+ salary);
    }

    public double getSpace(){
        return 10+ salary /10000;
    }

    public boolean equals(Employee m){
        if (m!=null && m.salary== this.salary && this.position== m.position){
            return true;
        } else {
            return false;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public static int getCounter(){
        return counter;
    }

}
