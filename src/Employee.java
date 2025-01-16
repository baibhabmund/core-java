public class Employee {
    String emp_name;
    int emp_id;
    int salary;

    public Employee(String emp_name, int emp_id, int salary){
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.salary = salary;
    }
    public String getEmp_name(){
        return emp_name;
    }
    public void setEmp_name(String emp_name){
        this.emp_name = emp_name;
    }
    public int getEmp_id(){
        return emp_id;
    }
    public void setEmp_id(int emp_id){
        this.emp_id = emp_id;
    }
    public int getsalary(){
        return salary;
    }
    public void setsalary(int salary){
        this.salary = salary;
    }
    public void display(){
        System.out.println(emp_name);
        System.out.println(emp_id);
        System.out.println(salary);
    }
    public static void main(String args[]){
        Employee e1 = new Employee("Rohit", 101, 500000);
        e1.display();
    }
}
