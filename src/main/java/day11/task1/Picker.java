package day11.task1;

public class Picker implements Worker{

    private int salary;
    private static final int TASK_SALARY = 80;
    private Warehouse w;
    private boolean isPayed;



//    public Picker(int salary, boolean isPayed) {
//        this.salary = salary;
//        this.isPayed = isPayed;
//    }

    public Picker(Warehouse w) {
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
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += TASK_SALARY;
        w.incrementPickedOrders();
    }

    @Override
    public void bonus() {
        if (isPayed){
            System.out.println("Бонус уже был выплачен");
        }
        else if (w.getCountPickedOrders() >= 10000){
            salary += 70000;
            isPayed = true;
        }else
            System.out.println("Бонус пока не доступен");
    }
}
