package day11.task1;

public class Courier implements Worker{

    private int salary;
    private static final int TASK_SALARY = 100;
    private Warehouse w;
    private boolean isPayed;

//    public Courier(int salary, boolean isPayed) {
//        this.salary = salary;
//        this.isPayed = isPayed;
//    }

    public Courier(Warehouse w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += TASK_SALARY;
        w.incrementDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (isPayed){
            System.out.println("Бонус уже был выплачен");
        }
        else if (w.getCountDeliveredOrders() == 10000){
            salary += 50000;
            isPayed = true;
        } else
            System.out.println("Бонус пока не доступен");
    }
}
