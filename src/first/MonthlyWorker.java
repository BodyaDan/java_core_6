package first;

public class MonthlyWorker implements Payment{
    private String name;
    private double Salary;
    private double totalEarned;

    MonthlyWorker(String name, double Salary) {
        this.name = name;
        this.Salary = Salary;
    }

    @Override
    public void salary() {
        this.totalEarned = Salary * 12;
        System.out.println(totalEarned + "$ в рік");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public double getTotalEarned() {
        return totalEarned;
    }
}
