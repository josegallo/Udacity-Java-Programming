
public class Employee
{
    private String name;
    private double salary;
    
    /**
     * Constructs a Employee
     * @name the name of the Employee
     * @salary the salary of this Employee
     */
    public Employee(String name, double salary)
    {

        this.name = name;
        this.salary = salary;

    }

    public String getName()
    {
        return name;
    }
    
    public double getSalary()
    {
        return salary;
    }
   
    public String toString()
    {
        return "name : " +  name + " salary: " + salary;
        
    }
}
