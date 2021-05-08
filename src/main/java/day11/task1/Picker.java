package day11.task1;

public class Picker implements  Worker{
    private int salary;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    int getSalary() {return salary; }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder()+1);
        if (warehouse.getCountOrder() % 1500 == 0) {
            bonus();
        }
    }

    @Override
    public void bonus() {
        salary = salary * 3;
    }
}
