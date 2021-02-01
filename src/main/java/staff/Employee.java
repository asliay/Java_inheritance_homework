package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private int salary;

    public Employee(String name, String niNumber, int salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getNINumber() {
        return this.niNumber;
    }

    public int getSalary() {
        return this.salary;
    }

    public void raiseSalary(Double raise) {
        if(raise > 0) {
            this.salary += raise;
        }
    }

    public double payBonus() {
        return (this.salary * 0.01);
    }
}
