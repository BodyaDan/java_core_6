package first;

public class Application {
    public static void main(String[] args) {
        HourWorker hourWorker = new HourWorker("John", 12.5);
        MonthlyWorker monthlyWorker = new MonthlyWorker("Kevin", 3200);

        System.out.println("При годинній оплаті " + hourWorker.getPayAmount() + " " + hourWorker.getName()
                + " заробляє:");
        hourWorker.salary();

        System.out.println("При місячній оплаті " + monthlyWorker.getSalary() + " " + monthlyWorker.getName()
                + " заробляє:");
        monthlyWorker.salary();
    }
}
