package lecture7.solutions;


public class Company {

    public static void main(String[] args) {
        Employee[] employees= new Employee[100];
        for (int i=0; i<100; i++){
            if (i<10){
                employees[i]= new Employee(1);
            } else if (i<40){
                employees[i]= new Employee(2);
            } else {
                employees[i]= new Employee(3);
            }
            employees[i].print();
        }
        double salary=0;
        double area=0;
        for (int i=0; i<100; i++){
            salary += employees[i].getSalary();
            area += employees[i].getSpace();
        }
        System.out.println("Space "+area);
        System.out.println("Salary "+salary);
        System.out.println(Employee.getCounter());
    }

}
