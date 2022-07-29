package first;

public class HourWorker implements Payment{
    private String name;
    private double payAmount;
    private double totalEarned;

    HourWorker(String name, double payAmount) {
        this.name = name;
        this.payAmount = payAmount;
    }

    @Override
    public void salary() {
        this.totalEarned = payAmount * 12 * 30 * 8;
        System.out.println(totalEarned + "$ в рік");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(double payAmount) {
        this.payAmount = payAmount;
    }

    public double getTotalEarned() {
        return totalEarned;
    }
}
