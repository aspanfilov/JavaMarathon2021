package day11.task1;

public class Courier implements Worker{
    private int salary;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setBalance(warehouse.getBalance()+1000);
        if (warehouse.getBalance() % 1000000 == 0) {
            bonus();
        }
    }

    @Override
    public void bonus() {
        salary = salary * 2;
    }

}
