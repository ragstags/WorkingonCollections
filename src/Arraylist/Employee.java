package Arraylist;

/**
 * Created by nadimchouglay on 18/09/2017.
 */
public class Employee implements Comparable<Employee> {
    String name,department;
    int salary;

    public Employee(String name, String department, int salary) {
        super();
        this.name = name;
        this.department = department;
        this.salary = salary;
    }


    public int compareTo(Employee o) {
        if(this.salary <o.salary){
            return -1;
        }else if (this.salary>o.salary) {
            return 1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
